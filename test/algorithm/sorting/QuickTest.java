package algorithm.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickTest {
    @Test
    public void many() throws Exception {
        int[] test = new int[]{8, 6, 4, 5, 0, 8, 1};
        Quick.quickSort(test, 0, test.length - 1);
        assertArrayEquals(new int[]{0, 1, 4, 5, 6, 8, 8}, test);
    }

    @Test
    public void one() throws Exception {
        int[] test = new int[]{8};
        Quick.quickSort(test, 0, test.length - 1);
        assertArrayEquals(new int[]{8}, test);
    }

    @Test
    public void two() throws Exception {
        int[] test = new int[]{8, 3};
        Quick.quickSort(test, 0, test.length - 1);
        assertArrayEquals(new int[]{3, 8}, test);
    }
}