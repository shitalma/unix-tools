package shitalma.unixtools.cut;
import java.io.BufferedReader;
import java.io.FileReader;

class operations {
    public void cut_specific_character(int number,String text) {
        String[] result = text.split("\r\n");
        for (int i = 1; i < result.length; i++) {
            System.out.println(result[i].substring(2,3));
        }
    }
}
public class Cut {
    public static void main(String[] args) {
        operations operations = new operations();
        BufferedReader bufferedReader;
        String fileContent = null;
        int number = 0;
        try {
            String data = args[0].substring(2,3);
            number = Integer.parseInt(data);
            bufferedReader = new BufferedReader(new FileReader(args[1]));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null)
                fileContent += "\r\n" + currentLine;
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.cut_specific_character(number, fileContent);
    }
}
