package shitalma.unixtools.cli;

import shitalma.unixtools.fileSystem.FileReader;
import shitalma.unixtools.libraries.UniqLib;

public class Uniq {
    public static void main(String[] args) {
        UniqLib operations = new UniqLib();
        FileReader readContent = new FileReader();
        String fileData = readContent.readFile(args[0]);
        operations.uniqLines(fileData);
    }
}