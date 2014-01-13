package shitalma.unixtools.reduceSpace;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceReducerLibTest {
    @Test
    public void testSpaceReducer() throws Exception {
        String input = "I am                here.\r\n My name     is Shital\r\n How         are You";
        SpaceReducerLib spr = new SpaceReducerLib();
        String expected = "I am here.\r\n My name is Shital\r\n How are You\r\n";
        String actual = spr.spaceReducer(input);
        assertEquals(expected, actual);
    }
}
