package shitalma.unixtools.reduceSpace;

import java.io.IOException;

public class ReduceSpace {
    public static void main(String[] args) throws IOException {
        ReduceSpaceOperations rso = new ReduceSpaceOperations();
        String fileContent = rso.readFile(args[0]);
        rso.reduceSpace(fileContent);
    }
}
