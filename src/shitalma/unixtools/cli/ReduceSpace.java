package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.SpaceReducerLib;

import java.io.IOException;

public class ReduceSpace {
    public static void main(String[] args) throws IOException {
        FileReader readContent = new FileReader();
        SpaceReducerLib rso = new SpaceReducerLib();
        String fileContent = readContent.readFile(args[0]);
        String result = rso.spaceReducer(fileContent);
        String[] data = result.split("\r\n");
        for (String s : data)
            System.out.println(s);
    }
}
