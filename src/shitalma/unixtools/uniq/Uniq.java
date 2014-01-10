package shitalma.unixtools.uniq;
import shitalma.unixtools.MyFileReader;

class Operations extends MyFileReader{
    public void display_uniq(String text) {
        String[] result = text.split("\r\n");
        for(int i =0 ; i< result.length-1; i++){
            if(0 != result[i].compareTo(result[i + 1]))
                System.out.println(result[i]);
        }
    }
}
public class Uniq {
    public static void main(String[] args) {
        Operations operations = new Operations();
        String fileData = operations.readFile(args[0]);
        operations.display_uniq(fileData);
    }
}