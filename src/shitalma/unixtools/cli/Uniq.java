package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.UniqLib;

public class Uniq {
    public static void main(String[] args) {
        UniqLib operations = new UniqLib();
        FileReader readContent = new FileReader();
        String fileData = readContent.readFile(args[0]);
        String result = operations.uniqLines(fileData);
        String[] data = result.split("\r\n");
        for (String s : data)
            System.out.println(s);
    }
}