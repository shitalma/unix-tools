package shitalma.unixtools.reduceSpace;

import shitalma.unixtools.MyFileReader;

public class ReduceSpaceOperations extends MyFileReader{
    public void reduceSpace(String fileContent) {
        String[] result = fileContent.split("\r\n");
        for (int i = 0; i < result.length-1; i++)
            System.out.println(result[i].replaceAll("\\s+"," "));
    }
}
