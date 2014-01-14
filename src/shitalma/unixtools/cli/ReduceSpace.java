package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.SpaceReducerLib;

public class ReduceSpace {
    public static void main(String[] args) {
        FileReader readContent = new FileReader();
        SpaceReducerLib rso;
        rso = new SpaceReducerLib();
        String fileContent = readContent.readFile(args[0]);
        String lines = rso.spaceReducer(fileContent);
        System.out.println(lines);
    }
}