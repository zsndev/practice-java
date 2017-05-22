package quiz;

import util.ArrayUtil;

public class RandomNumber {

    public static void randomNumber(int[] src) {
        int length = src.length;
        while (length > 0) {
            int random = (int) (Math.random() * length);
            System.out.println(src[random]);
            ArrayUtil.exchange(src, random, --length);
        }
    }

    public static void main(String[] args) {
        randomNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

}
