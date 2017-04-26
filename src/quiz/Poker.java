package quiz;

public class Poker {
//    游戏的规则是这样的：将一副扑克牌平均分成两份，每人拿一份。小哼先拿出手中的
//    第一张扑克牌放在桌上，然后小哈也拿出手中的第一张扑克牌，并放在小哼刚打出的扑克牌
//    的上面，就像这样两人交替出牌。出牌时，如果某人打出的牌与桌上某张牌的牌面相同，即
//    可将两张相同的牌及其中间所夹的牌全部取走，并依次放到自己手中牌的末尾。当任意一人
//    手中的牌全部出完时，游戏结束，对手获胜。

    public static String playPoker(Hand playerA, Hand playerB) {
        Table table = new Table();
        while (!playerA.isEmpty() && !playerB.isEmpty()) {
            int cardA = playerA.outQueue();
            playerA.inQueue(table.inStack(cardA));
            int cardB = playerB.outQueue();
            playerB.inQueue(table.inStack(cardB));
        }
        if (playerA.isEmpty()) {
            return "playerA";
        } else {
            return "playerB";
        }
    }

    public static class Hand {
        int capacity = 64;
        public int[] cards = new int[capacity];
        public int head = 0;
        public int tail;

        public Hand(int[] player) {
            System.arraycopy(player, 0, cards, 0, player.length);
            tail = player.length;
        }

        public int outQueue() {
            int value = cards[head % capacity];
            head++;
            return value;
        }

        public void inQueue(int[] values) {
            for (int i : values) {
                if (i != 0) {
                    inQueue(i);
                }
            }
        }

        public void inQueue(int value) {
            cards[tail % capacity] = value;
            tail++;
        }

        public boolean isEmpty() {
            return head == tail;
        }
    }

    public static class Table {
        public int[] cards = new int[64];
        public int top = -1;
        private boolean[] bucket = new boolean[10];

        public int[] inStack(int value) {
            int[] temp = new int[64];
            int index = 0;
            if (bucket[value]) {
                while (cards[top] != value) {
                    int tempA = cards[top];
                    temp[index++] = tempA;
                    cards[top--] = 0;
                    bucket[tempA] = false;
                }
                int tempB = cards[top];
                temp[index++] = tempB;
                cards[top--] = 0;
                bucket[tempB] = false;
            } else {
                top++;
                cards[top] = value;
                bucket[value] = true;
            }
            return temp;
        }
    }

}
