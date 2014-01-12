package shitalma.unixtools.head;

public class HeadLib {
    private String text;
    private int limit;
    public HeadLib(int noOfLines,String text){
        this.text = text;
        this.limit = noOfLines;
    }
    public String[] display_head(){
        String[] lines = text.split("\r\n");
        if(lines.length < limit)  limit = lines.length;
        String[] result = new String[limit];
        for (int i = 0; i < limit; i++)
            result[i] = lines[i];
        return result;
    }
}

