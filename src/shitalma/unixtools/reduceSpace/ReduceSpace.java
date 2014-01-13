package shitalma.unixtools.reduceSpace;

import shitalma.unixtools.FileReader;

import java.io.IOException;

public class ReduceSpace {
    public static void main(String[] args) throws IOException {
        FileReader readContent = new FileReader();
        SpaceReducerLib rso = new SpaceReducerLib();
        String fileContent = readContent.readFile(args[0]);
        rso.spaceReducer(fileContent);
    }
}
