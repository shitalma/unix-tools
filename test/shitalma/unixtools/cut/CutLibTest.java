package shitalma.unixtools.cut;

import org.junit.Test;
import shitalma.unixtools.tail.TailLib;

import static org.junit.Assert.assertEquals;

public class CutLibTest {
    final String input = "I am here.\r\nMy name is Shital\r\nHow are You\r\ndada\r\ndidi\r\n";
    @Test
    public void testCut_specific_character() throws Exception {
        CutLib cut = new CutLib();
        String expected = "I\r\nM\r\nH\r\nd\r\nd\r\n";
        String actual = cut.cutSpecificCharacter(1, input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCut_specific_field() throws Exception {
        CutLib cut = new CutLib();
        String expected = input;
        String actual = cut.cutSpecificField(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCut_using_specific_field_and_seperator() throws Exception {
        CutLib cut = new CutLib();
        String expected = "I\r\nMy\r\nHow\r\ndada\r\ndidi\r\n";
        String actual = cut.cutUsingSpecificFieldAndSeperator(1, " ", input);
        assertEquals(expected, actual);
    }
}
