package shitalma.unixtools.reduceSpace;

public class ReduceSpace {
    public static void main(String[] args) {
        ReduceSpaceOperations rso = new ReduceSpaceOperations();
        String fileContent = rso.readFile(args[0]);
        rso.reduceSpace(fileContent);
    }
}
