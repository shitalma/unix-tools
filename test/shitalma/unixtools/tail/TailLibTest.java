package shitalma.unixtools.tail;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TailLibTest {
    @Test
    public void testDisplay_tail() throws Exception {
        String input = "I am here.\r\n My name is Shital\r\n How are You";
        TailLib tail = new TailLib(7,input);
        String[] expected = {"I am here."," My name is Shital"," How are You"};
        String[] actual = tail.display_tail();
        assertArrayEquals(expected, actual);
    }
}
