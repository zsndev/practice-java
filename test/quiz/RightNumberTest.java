package quiz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RightNumberTest {

    //测试要点 0 1  "" " "  奇偶性 MAX 负数
    @Test
    public void getRightNumber() throws Exception {
        String src = "631758924";
        String result = "615947283";
        assertEquals(result, RightNumber.getRightNumber(src));
        assertEquals("1", RightNumber.getRightNumber("1"));
        assertEquals("12", RightNumber.getRightNumber("12"));
        assertEquals("", RightNumber.getRightNumber(""));
    }

    @Test
    public void getNumber() throws Exception {
        String src = "631758924";
        String result = "615947283";
        assertEquals(result, RightNumber.getNumber(src));
        assertEquals("1", RightNumber.getNumber("1"));
        assertEquals("12", RightNumber.getNumber("12"));
        assertEquals("", RightNumber.getNumber(""));
    }

    @Test
    public void get() throws Exception {
        String src = "631758924";
        String result = "615947283";
        assertEquals(result, RightNumber.get(src));
        assertEquals("1", RightNumber.get("1"));
        assertEquals("12", RightNumber.get("12"));
        assertEquals("", RightNumber.get(""));
    }
}