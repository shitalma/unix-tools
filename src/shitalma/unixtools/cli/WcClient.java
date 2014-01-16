package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.WcLib;

public class WcClient {
    public static void main(String[] args) {
        FileReader readContent = new FileReader();
        String fileData = readContent.readFile(args[0]);
        WcLib operations = new WcLib(fileData);
        int lines = operations.countLines();
        int words = operations.countWords();
        int characters = operations.countCharacters();
        System.out.println(lines + " " + words + " " + characters + " " + args[0]);
    }
}