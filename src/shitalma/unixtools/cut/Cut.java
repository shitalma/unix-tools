package shitalma.unixtools.cut;

public class Cut {
    public static void main(String[] args) {
        CutOperations operations = new CutOperations();
        String fileContent;
        String seperator = args[1].substring(2,3);
        String data = args[0].substring(2,3);
        int number = Integer.parseInt(data);
        fileContent = operations.readFile(args[2]);
        operations.cut_specific_character(number, fileContent);
        operations.cut_specific_field(number, fileContent);
        operations.cut_using_specific_field_and_seperator(number, seperator, fileContent);
    }
}
