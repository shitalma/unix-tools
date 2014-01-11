package shitalma.unixtools.sort;


public class Sort {
    public static void main(String[] args) {
        String[] sortedData;
        sortOperations so = new sortOperations();
        String fileContent = so.readFile(args[0]);
        sortedData = so.sort(fileContent);
        for (String s : sortedData) {
            System.out.println(s);
        }
        System.out.println("reversing string\n\n\n\n\n");
        String[] reverse = so.reverseData(fileContent);
        for (String s : reverse) {
            System.out.println(s);
        }

    }
}
