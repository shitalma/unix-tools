package shitalma.unixtools.sort;

import shitalma.unixtools.MyFileReader;

import java.util.Arrays;


public class sortOperations extends MyFileReader{
    public String[] sort(String fileContent) {
        String[] lines = fileContent.split("\r\n");
        Arrays.sort(lines);
        return lines;
    }
}
