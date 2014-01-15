package shitalma.unixtools.sort;

import shitalma.unixtools.libraries.sortLib;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class sortLibTest {
    final String text = "Shital\r\nRadhika\r\nTushar";

    @Test
    public void testSortData() throws Exception {
        String expected = "Radhika\r\nShital\r\nTushar";
        sortLib sort = new sortLib();
        String result = sort.sortData(text);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseData() throws Exception {
        String expected = "Tushar\r\nShital\r\nRadhika";

        sortLib sort = new sortLib();
        String result = sort.reverseData(text);
        assertEquals(expected, result);
    }

    @Test
    public void testWhenInputIsEmptyForSortedOrder() throws Exception {
        String expected = "";

        sortLib sort = new sortLib();
        String result = sort.sortData("");
        assertEquals(expected, result);
    }

    @Test
    public void testWhenInputIsEmptyForReverseOrder() throws Exception {
        String expected = "";

        sortLib sort = new sortLib();
        String result = sort.reverseData("");
        assertEquals(expected, result);
    }
}
