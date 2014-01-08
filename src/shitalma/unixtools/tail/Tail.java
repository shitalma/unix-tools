package shitalma.unixtools.tail;
import java.io.BufferedReader;
import java.io.FileReader;

class operations {
    public void display_tail(int size,String text) {
        String[] result = text.split("\r\n");
        for(int i = result.length-size ;  i < result.length; i++) System.out.println(result[i]);
    }
}
public class Tail {
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
        operations.display_tail(length, fileContent);
    }
}