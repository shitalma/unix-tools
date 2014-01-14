package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.WcLib;

public class WcClient{
    public static void main(String[] args) {
        FileReader readContent = new FileReader();
        WcLib operations = new WcLib();
        String fileData = readContent.readFile(args[0]);
        int lines = operations.countLines(fileData);
        int words = operations.countWords(fileData);
        int characters = operations.countCharacters(fileData);
        System.out.println(lines + " " + words + " " + characters + " " + args[0]);
    }
}