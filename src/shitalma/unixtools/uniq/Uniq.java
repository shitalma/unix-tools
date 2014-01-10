package shitalma.unixtools.uniq;
<<<<<<< HEAD

public class Uniq {
    public static void main(String[] args) {
        UniqOperations operations = new UniqOperations();
        String fileData = operations.readFile(args[0]);
        operations.display_uniq(fileData);
=======
import java.io.BufferedReader;
import java.io.FileReader;

class operations {
    public void display_uniq(String text) {
        String[] result = text.split("\r\n");
        for(int i =1; i< result.length-1; i++){
            if(0 != result[i].compareTo(result[i + 1]))
                System.out.println(result[i]);
        }
    }
}
public class Uniq {
    public static void main(String[] args) {
        operations operations = new operations();
        BufferedReader bufferedReader;
        String fileContent = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null)
                fileContent += "\r\n" + currentLine;
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.display_uniq(fileContent);
>>>>>>> origin/master
    }
}