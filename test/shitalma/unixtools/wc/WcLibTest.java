package shitalma.unixtools.wc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WcLibTest {
    @Test
    public void testCountLines() throws Exception {
        String input = "I am Shital Mane.\n I am from Satara.\nI am fine?";
        WcLib wc = new WcLib();
        int expected = 3;
        int actual = wc.countLines(input);
        assertEquals(expected, actual);
    }
}
