package shitalma.unixtools.uniq;

import org.junit.Test;
import shitalma.unixtools.libraries.UniqLib;

import static junit.framework.Assert.assertEquals;

public class UniqLibTest {
    @Test
    public void testuniqData() throws Exception {
        String input = "I am here.\r\nI am here.\r\nMy name is Shital\r\n How are You\r\n How are You";
        UniqLib uniq = new UniqLib();
        StringBuilder expected = new StringBuilder();
        StringBuilder actual;

        expected.append("I am here.\r\nMy name is Shital\r\n How are You");
        actual = uniq.uniqData(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_uniqData() throws Exception {
        String input = "I am here.\r\nI am here.\r\nMy name is Shital\r\n How are You\r\n How are You\r\n";
        UniqLib uniq = new UniqLib();
        StringBuilder expected = new StringBuilder();
        StringBuilder actual;
        expected.append("I am here.\r\nMy name is Shital\r\n How are You");
        actual = uniq.uniqData(input);
        assertEquals(expected, actual);
    }
}
