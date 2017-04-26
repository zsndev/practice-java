package quiz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicTest {
    @Test
    public void isPalindromic() throws Exception {
        String a = "aba";
        String ab = "abab";
        String abc = "abcba";
        assertEquals(true, Palindromic.isPalindromic(a));
        assertEquals(false, Palindromic.isPalindromic(ab));
        assertEquals(true, Palindromic.isPalindromic(abc));
    }

}