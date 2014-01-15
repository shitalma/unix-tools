package shitalma.unixtools.wc;

import org.junit.Test;
import shitalma.unixtools.libraries.WcLib;

import static org.junit.Assert.assertEquals;

public class WcLibTest {
    final String input = "I am Shital Mane.\r\nI am from Satara.\r\nI am fine?";

    @Test
    public void countLines() throws Exception {
        WcLib wc = new WcLib(input);

        int expected = 2;
        int actual = wc.countLines();

        assertEquals(expected, actual);
    }

    @Test
    public void countWords() throws Exception {
        WcLib wc = new WcLib(input);

        int expected = 11;
        int actual = wc.countWords();

        assertEquals(expected, actual);
    }

    @Test
    public void countCharacters() throws Exception {
        WcLib wc = new WcLib(input);

        int expected = 47;
        int actual = wc.countCharacters();

        assertEquals(expected, actual);
    }

    @Test
    public void testIfTextIsEmpty() throws Exception {
        WcLib wc = new WcLib(" ");

        final int expected = 0;
        int actual = wc.countCharacters();
        assertEquals(expected, actual);

        actual = wc.countWords();
        assertEquals(expected, actual);

        actual = wc.countLines();
        assertEquals(expected, actual);
    }

    @Test
    public void testIfTextHaveOnlyOneLine() throws Exception {
        WcLib wc = new WcLib("I am Shital Mane.");

        int expected = 16;
        int actual = wc.countCharacters();
        assertEquals(expected, actual);

        expected = 4;
        actual = wc.countWords();
        assertEquals(expected, actual);

        expected = 0;
        actual = wc.countLines();
        assertEquals(expected, actual);
    }

    @Test
    public void testIfTextHaveMultipleEmptyLinesAtTheEnd() throws Exception {
        WcLib wc = new WcLib("I am Shital Mane.\r\n \r\n \r\n \r\n");

        int expected = 3;
        int actual = wc.countLines();
        assertEquals(expected, actual);

        expected = 4;
        actual = wc.countWords();
        assertEquals(expected, actual);

        expected = 27;
        actual = wc.countCharacters();
        assertEquals(expected, actual);
    }

    @Test
    public void testIfTextMultipleEmptyLines() throws Exception {
        WcLib wc = new WcLib("\r\n \r\n \r\n \r\n \r\n \r\n");

        int expected = 5;
        int actual = wc.countLines();
        assertEquals(expected, actual);

        expected = 0;
        actual = wc.countWords();
        assertEquals(expected, actual);

        expected = 16;
        actual = wc.countCharacters();
        assertEquals(expected, actual);
    }
}