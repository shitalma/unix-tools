package shitalma.unixtools.cut;

import org.junit.Test;
import shitalma.unixtools.libraries.CutLib;

import static junit.framework.Assert.assertEquals;

public class CutLibTest {
    @Test
    public void testCutCount() throws Exception {
        String text = "manali T\nShital M";
        String expected = "manali\r\nShital\r\n";
        CutLib uniq = new CutLib();
        String result = uniq.column(1, " ", text);
        String actual = result.toString();
        assertEquals(expected, actual);
    }

}
