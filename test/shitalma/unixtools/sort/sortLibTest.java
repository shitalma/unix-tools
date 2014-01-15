package shitalma.unixtools.sort;

import shitalma.unixtools.libraries.sortLib;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class sortLibTest {
    @Test
    public void testSortData() throws Exception {
        String text = "Ram\nSam\nTum";
        String expected = "Ram\r\nSam\r\nTum\r\n";
        sortLib uniq = new sortLib();
        String result = uniq.sortData(text);
        assertEquals(expected, result.toString());
    }

    @Test
    public void testReverseData() throws Exception {
        String text = "Ram\nSam\nTum";
        String expected = "Tum\r\nSam\r\nRam\r\n";

        sortLib uniq = new sortLib();
        String result = uniq.reverseData(text);
        String actual = result.toString();
        assertEquals(expected, actual);
    }
}
