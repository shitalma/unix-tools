package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.MyFileReader;
import shitalma.unixtools.libraries.SpaceReducerLib;

import java.io.IOException;

public class ReduceSpace {
    public static void main(String[] args) throws IOException {
        MyFileReader readContent = new MyFileReader();
        SpaceReducerLib rso;
        rso = new SpaceReducerLib();
        String fileContent = readContent.readFile(args[0]);
        String lines = rso.spaceReducer(fileContent);
        System.out.println(lines);
    }
}