package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.UniqLib;

public class Uniq {
    public static void main(String[] args) {
        UniqLib operations = new UniqLib();
        FileReader readContent;
        readContent = new FileReader();
        String fileData = readContent.readFile(args[0]);
        String lines = operations.uniqLines(fileData);
        String[] result = lines.split("\r\n");
        StringBuilder sb = new StringBuilder();
        for (String line : result) {
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}