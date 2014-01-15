package shitalma.unixtools.tail;

import org.junit.Test;
import shitalma.unixtools.libraries.TailLib;

import static org.junit.Assert.assertEquals;

public class TailLibTest {
    final String input = "I am here.\r\n My name is Shital\r\n How are You\r\n"+
            "manali\r\nkajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha";
    @Test
    public void displayTailWhenNumberIsLessThanTen() throws Exception {
        TailLib tail = new TailLib(2, input);
        String expected = "prajakta\r\nsamiksha";
        String actual = tail.display_tail();
        assertEquals(expected, actual);
    }
    @Test
    public void displayTailWhenNumberOfLinesAreByeDefaultTen() throws Exception {
        TailLib tail = new TailLib(10, input);
        String expected = " My name is Shital\r\n How are You\r\nmanali\r\n"+
                "kajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha";
        String actual = tail.display_tail();
        assertEquals(expected, actual);
    }

    @Test
    public void displayTailWhenNumberOfLinesMoreThanTen() throws Exception {
        TailLib tail = new TailLib(13, input);
        String expected = "I am here.\r\n My name is Shital\r\n How are You\r\nmanali\r\n"+
                 "kajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha";
        String actual = tail.display_tail();
        assertEquals(expected, actual);
    }

    @Test
    public void displayTailWhenNumberOfLinesMoreThanHundread() throws Exception {
        TailLib tail = new TailLib(130, input);
        String expected = "I am here.\r\n My name is Shital\r\n How are You\r\nmanali\r\n"+
                "kajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha";
        String actual = tail.display_tail();
        assertEquals(expected, actual);
    }

    @Test
    public void displayTailWhenNumberOfLinesWhenTextIsEmpty() throws Exception {
        TailLib tail = new TailLib(1, "");
        String expected = "";
        String actual = tail.display_tail();
        assertEquals(expected, actual);
    }
}
