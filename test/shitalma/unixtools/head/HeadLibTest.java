package shitalma.unixtools.head;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HeadLibTest {
    @Test
    public void testDisplay_head() throws Exception {
        String input = "I am here.\r\n My name is Shital\r\n How are You";
        HeadLib head = new HeadLib(2,input);
        String[] expected = {"I am here.", " My name is Shital"};
        String[] actual = head.display_head();
        assertArrayEquals(expected, actual);
    }
}