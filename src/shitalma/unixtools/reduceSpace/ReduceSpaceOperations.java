package shitalma.unixtools.reduceSpace;

import shitalma.unixtools.MyFileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReduceSpaceOperations extends MyFileReader{
    BufferedWriter writeTo;
    public ReduceSpaceOperations() {
        try {
            writeTo = new BufferedWriter(new FileWriter("d.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reduceSpace(String fileContent) throws IOException {
        String[] result = fileContent.split("\r\n");
        for (int i = 0; i < result.length-1; i++){
            String data = result[i].replaceAll("\\s+", " ");
            System.out.println(data);
            writeTo.write(data+"\r\n");
        }
        writeTo.close();
    }
}
