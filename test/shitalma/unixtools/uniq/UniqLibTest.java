package shitalma.unixtools.uniq;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqLibTest {
    @Test
    public void testUniqLinesWhenHaveSameLinesAtTheEndOfRecord() throws Exception {
        String input = "I am here.\r\nI am here.\r\nMy name is Shital\r\n How are You\r\n How are You";
        UniqLib uniq = new UniqLib();
        String expected;
        String actual;

        expected = "I am here.\r\nMy name is Shital\r\n How are You";
        actual = uniq.uniqLines(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testUniqLinesWhenHaveExtraEmptyLineAtTheEnd() throws Exception {
        String input = "I am here.\r\nI am here.\r\nMy name is Shital\r\n How are You\r\n How are You\r\n";
        UniqLib uniq = new UniqLib();
        String expected;
        String actual;
        expected = "I am here.\r\nMy name is Shital\r\n How are You";
        actual = uniq.uniqLines(input);
        assertEquals(expected,actual);
    }
}
