package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.MyFileReader;
import shitalma.unixtools.libraries.UniqLib;

public class Uniq {
    public static void main(String args[]) {
        String text;
        StringBuilder result;
        MyFileReader readFile = new MyFileReader();
        text = readFile.readFile(args[0]);
        UniqLib uniq = new UniqLib(text);
        result = uniq.uniqData();
        System.out.println(result);
    }
}