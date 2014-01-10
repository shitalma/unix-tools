package shitalma.unixtools.tail;

public class Tail {
    public static void main(String[] args) {
        TailOperations operations = new TailOperations();
        int length = 10;
        String fileData;
        if(args.length == 2){
            length = Integer.parseInt(args[0]) * (-1);
            fileData = operations.readFile(args[1]);
        }
        else
            fileData = operations.readFile(args[0]);
        operations.display_tail(length, fileData);
    }
}