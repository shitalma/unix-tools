package shitalma.unixtools.uniq;

public class Uniq {
    public static void main(String[] args) {
        UniqOperations operations = new UniqOperations();
        String fileData = operations.readFile(args[0]);
        operations.display_uniq(fileData);
    }
}