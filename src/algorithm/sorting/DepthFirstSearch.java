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
        return;
    }

}
