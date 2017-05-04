package algorithm.sorting;

public class BreadthFirstSearch {
    public static class Node {
        public int x;
        public int y;
        public int step;
        public int parent;
        public int index;

        public Node() {
        }

        public Node(int x, int y, int step, int parent, int index) {
            this.x = x;
            this.y = y;
            this.step = step;
            this.parent = parent;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "x=" + x +
                    ", y=" + y +
                    ", step=" + step +
                    ", parent=" + parent +
                    ", index=" + index +
                    '}';
        }
    }

    //0是空地，1是障碍物
    public static int[][] map = new int[][]{
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 1}
    };
    public static int[][] bookMap = new int[map.length][map[0].length];
    public static Node[] queue = new Node[map.length * map[0].length];//不用考虑tail，特别+1了
    public static int qHead = 0;
    public static int qTail = 0;
    // 右 下 左 上 clock-wise
    public static int[][] directs = new int[][]{
            {1, 0}, {0, 1}, {-1, 0}, {0, -1}
    };
    public static int[] dest = {3, 2};
    public static int minStep = Integer.MAX_VALUE;

    public static void bfs() {
        //初始化
        Node enterPoint = new Node(0, 0, 0, -1, 0);
        queue[qTail] = enterPoint;
        qTail++;
        bookMap[0][0] = 1;
        // ==时，说明已经无路可走了
        while (qHead < qTail) {
            for (int i = 0; i < directs.length; i++) {
                int[] direction = directs[i];
                int nextX = queue[qHead].x + direction[0];
                int nextY = queue[qHead].y + direction[1];
                if (nextX < 0 || nextX > 4 || nextY < 0 || nextY > 3) {
                    continue;
                }
                if (map[nextX][nextY] == 0 && bookMap[nextX][nextY] == 0) {
                    bookMap[nextX][nextY] = 1;
                    Node node = new Node(nextX, nextY, queue[qHead].step + 1, qHead, qTail);
                    queue[qTail] = node;
                    qTail++;
                }
                if (nextX == dest[0] && nextY == dest[1]) {
                    bookMap[nextX][nextY] = 0;
                    Node node = queue[qTail - 1];
                    while (node.parent > -1) {
                        System.out.println(node);
                        node = queue[node.parent];
                    }
                    System.out.println(node);
                    System.out.println("=================");
                    break;
                }
            }
            qHead++;
        }
    }


}
