package shitalma.unixtools.uniq;

import org.junit.Test;
import shitalma.unixtools.libraries.UniqLib;

import static junit.framework.Assert.assertEquals;

public class UniqLibTest {
    final String input = "I am here.\r\nI am here.\r\nMy name is Shital\r\n How are You\r\n How are You";
    @Test
    public void uniqForMultipleLines() throws Exception {
        UniqLib uniq = new UniqLib(input);
        StringBuilder expected = new StringBuilder();
        StringBuilder actual;

        expected.append("I am here.\r\nMy name is Shital\r\n How are You");
        actual = uniq.uniqData();

        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void uniqForMultipleEmptyLinesAtTheEnd() throws Exception {
        UniqLib uniq = new UniqLib(input+"\r\n");
        StringBuilder expected = new StringBuilder();
        StringBuilder actual;

        expected.append("I am here.\r\nMy name is Shital\r\n How are You");
        actual = uniq.uniqData();

        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    public void uniqWillReturnEmptyStringWhenInputIsEmpty() throws Exception {
        UniqLib uniq = new UniqLib("");
        StringBuilder expected = new StringBuilder();
        StringBuilder actual;

        expected.append("");
        actual = uniq.uniqData();

        assertEquals(expected.toString(), actual.toString());
    }
}
