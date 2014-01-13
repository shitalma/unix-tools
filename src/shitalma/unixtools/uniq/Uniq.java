package shitalma.unixtools.uniq;

import shitalma.unixtools.FileReader;

public class Uniq {
    public static void main(String[] args) {
        UniqLib operations = new UniqLib();
        FileReader readContent = new FileReader();
        String fileData = readContent.readFile(args[0]);
        operations.uniqLines(fileData);
    }
}