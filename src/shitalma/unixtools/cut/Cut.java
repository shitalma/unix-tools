package shitalma.unixtools.cut;

public class Cut {
    public static void main(String[] args) {
        CutOperations operations = new CutOperations();
        String fileContent;
        if(args.length == 3) {           // for delimiter
            String seperator = args[1].substring(2, 3);
            int number = Integer.parseInt(args[0].substring(2,3));
            fileContent = operations.readFile(args[2]);
            operations.cut_using_specific_field_and_seperator(number, seperator, fileContent);
        }
        try {
            if(args.length == 2) {           // for field and character
                fileContent = operations.readFile(args[1]);
                int number = Integer.parseInt(args[0].substring(2,3));
                String character = args[0].substring(0, 2);
                if (0 == character.compareTo("-f"))
                    operations.cut_specific_field(fileContent);
                else operations.cut_specific_character(number, fileContent);
            }
        } catch(Exception e) {
            System.err.println("Have error for reading file");
        }
    }
}