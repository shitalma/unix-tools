package shitalma.unixtools.head;
import java.io.BufferedReader;
import java.io.FileReader;

class operations {
    public void display_head(int size,String text) {
        String[] result = text.split("\r\n");
        for(int i = 1 ; i < size ; i++)
            System.out.println(result[i]);
    }
}
public class Head {
    public static void main(String[] args) {
        operations operations = new operations();
        int length = 10;
        BufferedReader bufferedReader;
        String fileContent = null;
        try {
            if(args.length == 2){
                length = Integer.parseInt(args[0]) * (-1);
                bufferedReader = new BufferedReader(new FileReader(args[1]));
            }
            else
                bufferedReader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null)
                fileContent += "\r\n" + currentLine;
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.display_head((length+1), fileContent);
    }
}