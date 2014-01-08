package shitalma.unixtools.wc;
import java.io.BufferedReader;
import java.io.FileReader;

class operations {
    public int countLines(String text) {
        int noOfLines = 0;
        String[] result = text.split("\r\n");
        for (String i : result) {
            noOfLines += i.split("\n").length;
        }
        return noOfLines;
    }

    public int countWords(String text) {
        int noOfWords = 0;
        String[] result = text.split("\r\n");
        for (String item : result) {
            noOfWords += item.split(" ").length;
        }
        return noOfWords;
    }

    public int countCharacters(String text) {
        return text.length();
    }
}
public class WcClient {
    public static void main(String[] args) {
        operations operations = new operations();
        int lines, words, characters;

        String fileContent = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fileContent += "\r\n" + currentLine;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        lines = operations.countLines(fileContent);
        words = operations.countWords(fileContent);
        characters = operations.countCharacters(fileContent);
        System.out.println(lines + " " + words + " " + characters + " " + args[0]);
    }
}