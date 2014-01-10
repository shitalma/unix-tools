package shitalma.unixtools.head;

import shitalma.unixtools.MyFileReader;

public class HeadOperations extends MyFileReader {
    public void display_head(int size,String text) {
        String[] result = text.split("\r\n");
        for(int i = 0 ; i < size ; i++)
            System.out.println(result[i]);
    }
}
