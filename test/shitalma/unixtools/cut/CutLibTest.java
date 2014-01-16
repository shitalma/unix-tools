package shitalma.unixtools.cut;

import org.junit.Test;
import shitalma.unixtools.libraries.CutLib;

import static junit.framework.Assert.assertEquals;

public class CutLibTest {
    @Test
    public void testCutCharactersForGivenNumber() throws Exception {
        String input = "Shital mane\r\nsnehal patil\r\nkajal jadhav";
        CutLib cutter = new CutLib();
        String expected = "S\r\ns\r\nk";
        String actual = cutter.cutByCharacter(1,input);

        assertEquals(expected, actual);
    }
    @Test
    public void testCutFieldsForGivenNumber() throws Exception {
        String input = "Shital mane\r\nsnehal patil\r\nkajal jadhav";
        CutLib cutter = new CutLib();
        String expected = "Shital\r\nsnehal\r\nkajal";
        String actual = cutter.cutByFieldAndSeparator(1, " ", input);

        assertEquals(expected, actual);
    }
    @Test
    public void testCutFieldsForGivenNumberIsNumberIsMoreThanAvailableNumber() throws Exception {
        String input = "Shital mane\r\nsnehal patil\r\nkajal jadhav";
        CutLib cutter = new CutLib();
        String expected = "Shital mane\r\nsnehal patil\r\nkajal jadhav";
        String actual = cutter.cutByFieldAndSeparator(1,"\t",input);

        assertEquals(expected, actual);
    }

    @Test
    public void testCutIfTextIsEmpty() throws Exception {
        String input = "";
        CutLib cutter = new CutLib();
        String expected = "";
        String actual = cutter.cutByFieldAndSeparator(1,"\t",input);

        assertEquals(expected, actual);
    }

    @Test
    public void testCutIfGivesAnotherSeperator() throws Exception {
        String input = "Shital mane\r\nsnehal patil\r\nkajal jadhav";
        CutLib cutter = new CutLib();
        String expected = "\r\n\r\n";
        String actual = cutter.cutByFieldAndSeparator(67," ",input);

        assertEquals(expected, actual);
    }

    @Test
    public void testCutIfGivesOnlySingleLine() throws Exception {
        String input = "Shital mane";
        CutLib cutter = new CutLib();
        String expected = "mane";
        String actual = cutter.cutByFieldAndSeparator(2," ",input);

        assertEquals(expected, actual);
    }

    @Test
    public void testCutByOnlyField() throws Exception {
        String input = "Shital mane";
        CutLib cutter = new CutLib();
        String expected = "Shital mane";
        String actual = cutter.cutByField(input);

        assertEquals(expected, actual);
    }
}
