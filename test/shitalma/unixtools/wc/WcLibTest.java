package shitalma.unixtools.wc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WcLibTest {
    final String input = "I am Shital Mane.\r\nI am from Satara.\r\nI am fine?";
    @Test
    public void testCountLines() throws Exception {
        WcLib wc = new WcLib();
        int expected = 3;
        int actual = wc.countLines(input);
        assertEquals(expected, actual);
    }
    @Test
    public void testCountWords() throws Exception {
        WcLib wc = new WcLib();
        int expected = 11;
        int actual = wc.countWords(input);
        assertEquals(expected, actual);
    }
    @Test
    public void testCountCharacters() throws Exception {
        WcLib wc = new WcLib();
        int expected = 48;
        int actual = wc.countCharacters(input);
        assertEquals(expected, actual);
    }
}
