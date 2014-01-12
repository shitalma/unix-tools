package shitalma.unixtools.tail;

public class TailLib {
    private String text;
    private int limit;
    public TailLib(int noOfLines,String text){
        this.text = text;
        this.limit = noOfLines;
    }
    public String[] display_tail(){
        int count = 0;
        String[] lines = text.split("\r\n");
        if(lines.length < limit)  return lines;
        String[] result = new String[limit];
        for (int i = (lines.length-limit); i < lines.length; i++) {
            result[count] = lines[i];
            count++;
        }
        return result;
    }
}