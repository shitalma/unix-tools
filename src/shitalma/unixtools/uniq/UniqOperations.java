package shitalma.unixtools.uniq;

import shitalma.unixtools.FileReader;

public class UniqOperations extends FileReader {
    public void display_uniq(String text) {
        String[] result = text.split("\r\n");
        for(int i =1; i< result.length-1; i++){
            if(0 != result[i].compareTo(result[i + 1]))
                System.out.println(result[i]);
        }
    }
}