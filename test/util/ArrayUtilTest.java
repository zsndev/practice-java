package util;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayUtilTest {
    @Test
    public void exchange() throws Exception {
        int[] array = new int[]{6, 4, 7, 3};
        ArrayUtil.exchange(array, 0, 2);
        assertArrayEquals(new int[]{7, 4, 6, 3}, array);
    }

}