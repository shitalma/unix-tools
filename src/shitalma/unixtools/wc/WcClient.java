package shitalma.unixtools.wc;

public class WcClient{
    public static void main(String[] args) {
        WcOperations operations = new WcOperations();
        String fileData = operations.readFile(args[0]);
        int lines = operations.countLines(fileData);
        int words = operations.countWords(fileData);
        int characters = operations.countCharacters(fileData);
        System.out.println(lines + " " + words + " " + characters + " " + args[0]);
    }
}