package quiz.july;

// 设计一个队列
// 支持： 出栈，入栈，最大值
// 要求: o(1) 均摊分析
public class QueueQuiz1 {
    public static class MyQueue {
        int max = Integer.MIN_VALUE;
        int[] values = new int[1];
        int head = -1;
        int tail = 0;

        public void in(int num) {
            max = Math.max(max, num);
            expandIfNeeded();
            values[tail++] = num;
            if (head == -1) {
                head = 0;
            }
        }

        public int out() {
            if (head == -1 || head == tail) {
                return Integer.MIN_VALUE;
            }
            int result = values[head++];
            return result;
        }

        public int getMax() {
            return max;
        }

        private void expandIfNeeded() {
            if (values.length == tail) {
                int[] temp = new int[values.length * 2];
                int gap = tail - head;
                System.arraycopy(values, head, temp, 0, gap);
                head = 0;
                tail = gap;
                values = temp;
            }
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        myQueue.in(1);
        myQueue.in(2);
        myQueue.in(3);
        System.out.println(myQueue.values.length);
        System.out.println(myQueue.getMax());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        myQueue.in(4);
        myQueue.in(5);
        myQueue.in(6);
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.out());
        System.out.println(myQueue.values.length);
    }


}

