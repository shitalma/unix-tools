package shitalma.unixtools.head;

import org.junit.Test;
import shitalma.unixtools.libraries.HeadLib;

import static org.junit.Assert.assertEquals;

public class HeadLibTest {
    @Test
    public void testDisplay_head() throws Exception {
        String input = "I am here.\r\n My name is Shital\r\n How are You";
        HeadLib head = new HeadLib(2,input);
        String expected = "I am here.\r\n My name is Shital\r\n";
        String actual = head.display_head();
        assertEquals(expected, actual);
    }
}