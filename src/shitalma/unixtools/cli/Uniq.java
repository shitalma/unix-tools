package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.UniqLib;

public class Uniq {
    public static void main(String args[]) {
        String text;
        StringBuilder result;
        FileReader readFile = new FileReader();
        text = readFile.readFile(args[0]);
        UniqLib uniq = new UniqLib(text);
        result = uniq.uniqData();
        System.out.println(result);
    }
}