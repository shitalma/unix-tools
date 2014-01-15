package shitalma.unixtools.reduceSpace;

import org.junit.Test;
import shitalma.unixtools.libraries.SpaceReducerLib;

import static org.junit.Assert.assertEquals;

public class SpaceReducerLibTest {
    @Test
    public void spaceReducerForMultipleLines() throws Exception {
        String input = "I am                here.\r\n My name     is Shital\r\n How         are You";
        SpaceReducerLib spr = new SpaceReducerLib();
        String expected = "I am here.\r\n My name is Shital\r\n How are You";
        String actual = spr.spaceReducer(input);
        assertEquals(expected, actual);
    }
}
