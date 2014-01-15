package shitalma.unixtools.libraries;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SpaceReducerLib {
        BufferedWriter writeTo;
        public SpaceReducerLib() {
            try {
                writeTo = new BufferedWriter(new FileWriter("d.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public String spaceReducer(String fileContent) throws IOException {
            String[] result = fileContent.split("\r\n");
            StringBuilder data = new StringBuilder();
            for (int i = 0; i < result.length; i++){
                data.append(result[i].replaceAll("\\s+", " ")).append("\r\n");
                writeTo.write(data+"\r\n");
            }
            writeTo.close();
            return data.toString();
        }
}