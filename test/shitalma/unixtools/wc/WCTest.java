package shitalma.unixtools.wc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WCTest {
    @Test
    public void testCountLines() throws Exception {
        WC wc = new WC();
        int expected = 3;
        String text = "shital\nkajal\nprajakta";
        int actual = wc.countLines(text);
        assertEquals(expected,actual);
    }
}