package algorithm.sorting;

import util.ArrayUtil;

public class Bubble {

    public static void bubbleSort(int[] src) {
        int maxIndex = src.length - 1;
        for (int i = 1; i <= src.length - 1; i++) {
            for (int j = 0; j < maxIndex; j++) {
                if (src[j] > src[j + 1]) {
                    ArrayUtil.exchange(src, j, j + 1);
                }
            }
            maxIndex--;
        }
    }

}
