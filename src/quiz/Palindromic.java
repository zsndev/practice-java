package quiz;

public class Palindromic {

    public static boolean isPalindromic(String src) {
        char[] chars = src.toCharArray();
        if (chars.length % 2 == 0) {
            return false;
        }
        int midIndex = chars.length / 2;
        for (int i = 1; i <= midIndex; i++) {
            if (chars[midIndex - i] != chars[midIndex + i]) {
                return false;
            }
        }
        return true;
    }

}
