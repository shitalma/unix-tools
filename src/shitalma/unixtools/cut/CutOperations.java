package shitalma.unixtools.cut;
import shitalma.unixtools.MyFileReader;

public class CutOperations extends MyFileReader {
    public void cut_specific_character(int number,String text) {
        String[] result = text.split("\r\n");
        for (int i = 0; i < result.length-1; i++)
            System.out.println(result[i].substring(number-1,number));
    }
    public void cut_specific_field(int fieldNumber,String text) {
        String[] result = text.split("\r\n");
        for (int i = 0; i < result.length; i++){
            String[] data = result[i].split(" ");
            if(data.length < fieldNumber)
                System.out.println("\n");
            else System.out.println(data[fieldNumber-1]);
        }
    }
    public void cut_using_specific_field_and_seperator(int fieldNumber,String seperator,String text) {
        String[] result = text.split("\r\n");
        for (int i = 0; i < result.length-1; i++)
            System.out.println(result[i].split(seperator)[fieldNumber]);
    }
}