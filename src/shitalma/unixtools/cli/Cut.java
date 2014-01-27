package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.MyFileReader;
import shitalma.unixtools.libraries.CutLib;

public class Cut {
    public static void main(String[] args) {
        Cut cutclient = new Cut();
        if (args.length == 0) {
            System.out.println("please give file name,fieldNo");
            return;
        }
        MyFileReader fs = new MyFileReader();
        CutLib cut = new CutLib();
        String properArgv[] = cutclient.getProperArgv(args);
        if(properArgv[3] != null){
            int characterValue = Integer.parseInt(properArgv[3].substring(2));
            String fileData = fs.readFile(properArgv[2]);
            System.out.println(cut.cutByCharacter(characterValue,fileData));
            return;
        }
        if (properArgv[0] == null && properArgv[1] == null || properArgv[0] != null && properArgv[1] == null) {
            String fileData = fs.readFile(properArgv[2]);
            System.out.println(cut.cutByField(fileData));
            return;
        }
        String delimitor = "\t";
        if (properArgv[1] != null)
            delimitor = properArgv[1].substring(2);
        if (properArgv[0] != null && properArgv[1] != null) {
            int fieldValue = Integer.parseInt(properArgv[0].substring(2));
            String fileData = fs.readFile(properArgv[2]);
            String columnData = cut.cutByFieldAndSeparator(fieldValue, delimitor, fileData);
            System.out.println(columnData);
        }
    }

    String[] getProperArgv(String[] arg) {
        String options[] = new String[4];
        for (int i = 0; i < arg.length; i++) {
            if (Cut.isfieldValue(arg[i]))
                options[0] = arg[i];
            if (Cut.isDelimitor(arg[i]))
                options[1] = arg[i];
            if (!Cut.isFileName(arg[i]))
                options[2] = arg[i];
            if (Cut.isCharacter(arg[i])) {
                options[3] = arg[i];
            }
        }
        return options;
    }

    static boolean isDelimitor(String arg) {
        return arg.matches("-d.*");
    }

    static boolean isCharacter(String arg) {
        return arg.matches("-c.*");
    }

    static boolean isfieldValue(String arg) {
        return arg.matches("-f.*");
    }

    static boolean isFileName(String arg) {
        return arg.matches("-.*");
    }
}