package util;

public class ArrayUtil {

    public static void exchange(int[] src, int indexA, int indexB) {
        int temp = src[indexA];
        src[indexA] = src[indexB];
        src[indexB] = temp;
    }

}
