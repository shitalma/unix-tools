package shitalma.unixtools.head;

public class Head {
    public static void main(String[] args) {
        HeadOperations operations = new HeadOperations();
        int length = 10;
        String fileData;
        if(args.length == 2){
            length = Integer.parseInt(args[0]) * (-1);
            fileData = operations.readFile(args[1]);
        }
        else
            fileData = operations.readFile(args[0]);
        operations.display_head((length), fileData);
    }
}