package shitalma.unixtools.tail;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailLibTest {
    final String input = "I am here.\r\nMy name is Shital\r\nHow are You\r\ndada\r\ndidi\r\nfamily\r\nkavita\r\nraj\r\nsamiksha\r\ntanbir\r\nprajakta";
    @Test
    public void testDisplay_tail() throws Exception {
        TailLib tail = new TailLib(2,input);
        String expected = "tanbir\r\nprajakta\r\n";
        String actual = tail.display_tail();
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayDefaultTail() throws Exception {
        TailLib tail = new TailLib(10,input);
        String expected = "My name is Shital\r\nHow are You\r\ndada\r\ndidi\r\nfamily\r\nkavita\r\nraj\r\nsamiksha\r\ntanbir\r\nprajakta\r\n";
        String actual = tail.display_tail();
        assertEquals(expected, actual);
    }
}
