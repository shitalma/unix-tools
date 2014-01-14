package shitalma.unixtools.cli;

import shitalma.unixtools.fileSystem.FileReader;
import shitalma.unixtools.libraries.CutLib;

public class Cut {
    public static void main(String[] args) {
        CutLib operations = new CutLib();
        FileReader readContent = new FileReader();
        String fileContent;
        if(args.length == 3) {           // for delimiter
            String seperator = args[1].substring(2, 3);
            int number = Integer.parseInt(args[0].substring(2,3));
            fileContent = readContent.readFile(args[2]);
            String data = operations.cutUsingSpecificFieldAndSeperator(number, seperator, fileContent);
            String[] result = data.split("\r\n");
            for (java.lang.Object o : result)
                System.out.println(o);
        }
        try {
            if(args.length == 2) {           // for field and character
                fileContent = readContent.readFile(args[1]);
                int number = Integer.parseInt(args[0].substring(2,3));
                String character = args[0].substring(0, 2);
                String data;
                if (0 == character.compareTo("-f"))
                    data = operations.cutSpecificField(fileContent);
                else data = operations.cutSpecificCharacter(number, fileContent);
                String[] result = data.split("\r\n");
                for (java.lang.Object o : result)
                    System.out.println(o);
            }
        } catch(Exception e) {
            System.err.println("Have error for reading file");
        }
    }
}