package shitalma.unixtools.sort;


public class Sort {
    public static void main(String[] args) {
        String[] sortedData;
        sortOperations so = new sortOperations();
        String fileContent;
        if(args.length == 2 && 0 == args[0].compareTo("-r")) {
            fileContent = so.readFile(args[1]);
            String[] reverse = so.reverseData(fileContent);
            for (String s : reverse)
                System.out.println(s);
        }
        else {
            fileContent = so.readFile(args[0]);
            sortedData = so.sort(fileContent);
            for (String s : sortedData)
                System.out.println(s);
        }
    }
}
