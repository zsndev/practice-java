package algorithm.sorting;

public class DepthFirstSearch {

    public static int[] src = new int[]{1, 2, 3};
    public static int[] book = new int[10];
    public static int[] result = new int[10];

    public static void dfs(int step) {
        int srcLength = src.length;
        if (step == srcLength) {
            for (int j = 0; j < srcLength; j++) {
                System.out.print(result[j] + " - ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < src.length; i++) {
            int value = src[i];
            if (book[value] == 0) {
                book[value] = 1;
                result[step] = value;
                dfs(step + 1);
                book[value] = 0;
            }
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
    // 右 下 左 上 clock-wise
    public static int[][] directs = new int[][]{
            {1, 0}, {0, 1}, {-1, 0}, {0, -1}
    };
    public static int[] dest = {3, 2};
    public static int minStep = Integer.MAX_VALUE;

    public static void dfsMap(int[] now, int step) {
        if (now[0] == dest[0] && now[1] == dest[1]) {
            if (step < minStep) {
                minStep = step;
            }
            return;
        }
        for (int i = 0; i < directs.length; i++) {
            int[] direction = directs[i];
            int nextX = now[0] + direction[0];
            int nextY = now[1] + direction[1];
            if (nextX < 0 || nextX > 4 || nextY < 0 || nextY > 3) {
                continue;
            }
            if (map[nextX][nextY] == 0 && bookMap[nextX][nextY] == 0) {
                bookMap[nextX][nextY] = 1;
                dfsMap(new int[]{nextX, nextY}, step + 1);
                bookMap[nextX][nextY] = 0;
            }
        }
    }

}
