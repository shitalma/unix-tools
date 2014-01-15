package shitalma.unixtools.head;

import org.junit.Test;
import shitalma.unixtools.libraries.HeadLib;

import static org.junit.Assert.assertEquals;

public class HeadLibTest {
    final String input = "I am here.\r\n My name is Shital\r\n How are You\r\n"+
            "manali\r\nkajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha";
    @Test
    public void displayHeadWhenNumberIsLessThanTen() throws Exception {
        HeadLib head = new HeadLib(2, input);
        String expected = "I am here.\r\n My name is Shital";
        String actual = head.display_head();
        assertEquals(expected, actual);
    }

    @Test
    public void displayHeadWhenNumberOfLinesAreByeDefaultTen() throws Exception {
        HeadLib head = new HeadLib(10, input);
        String expected = "I am here.\r\n My name is Shital\r\n How are You\r\nmanali\r\n"+
                "kajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta";
        String actual = head.display_head();
        assertEquals(expected, actual);
    }

    @Test
    public void displayHeadWhenNumberOfLinesMoreThanTen() throws Exception {
        HeadLib head = new HeadLib(13, input);
        String expected = "I am here.\r\n My name is Shital\r\n How are You\r\nmanali\r\n"+
                "kajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha";
        String actual = head.display_head();
        assertEquals(expected, actual);
    }

    @Test
    public void displayHeadWhenNumberOfLinesMoreThanHundread() throws Exception {
        HeadLib head = new HeadLib(130, input);
        String expected = "I am here.\r\n My name is Shital\r\n How are You\r\nmanali\r\n"+
                "kajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha";
        String actual = head.display_head();
        assertEquals(expected, actual);
    }

    @Test
    public void displayHeadWhenNumberOfLinesWhenTextIsEmpty() throws Exception {
        HeadLib head = new HeadLib(1, "");
        String expected = "";
        String actual = head.display_head();
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}