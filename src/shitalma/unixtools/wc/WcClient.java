package shitalma.unixtools.wc;

import shitalma.unixtools.MyFileReader;

public class WcClient{
    public static void main(String[] args) {
        MyFileReader readContent = new MyFileReader();
        WcLib operations = new WcLib();
        String fileData = readContent.readFile(args[0]);
        int lines = operations.countLines(fileData);
        int words = operations.countWords(fileData);
        int characters = operations.countCharacters(fileData);
        System.out.println(lines + " " + words + " " + characters + " " + args[0]);
    }
}