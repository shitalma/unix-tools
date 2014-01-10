package shitalma.unixtools.wc;
import shitalma.unixtools.MyFileReader;

public class WcOperations extends MyFileReader {
    public int countLines(String text) {
        int noOfLines = 0;
        String[] result = text.split("\r\n");
        for (String i : result)
            noOfLines += i.split("\n").length;
        return noOfLines;
    }

    public int countWords(String text) {
        int noOfWords = 0;
        String[] result = text.split("\r\n");
        int noOfLines = 0;
        for (String i : result)
            noOfLines += i.split("\n").length;
        for (String item : result)
            noOfWords += item.split(" ").length;
        return noOfWords+noOfLines-1;
    }

    public int countCharacters(String text) {
        return text.length();
    }
}