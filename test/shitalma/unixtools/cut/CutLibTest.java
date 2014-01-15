package shitalma.unixtools.cut;

import org.junit.Test;
import shitalma.unixtools.libraries.CutLib;

import static junit.framework.Assert.assertEquals;

public class CutLibTest {
    @Test
    public void testCutLinesForGivenField() throws Exception {
        String input = "Shital mane\nsnehal patil\nkajal jadhav";
        int fields = 1;
        CutLib cutter = new CutLib(fields," ",input);
        String expected = "Shital\r\nsnehal\r\nkajal";
        String actual = cutter.cutContent();

        assertEquals(expected, actual);
    }
//    @Test
//    public void testCutCount() throws Exception {
//        String expected = "manali\r\nShital";
//        CutLib cut = new CutLib(1, " ", input);
//        String result = cut.cutContent();
//        String actual = result.toString();
//        assertEquals(expected, actual);
//    }

}
