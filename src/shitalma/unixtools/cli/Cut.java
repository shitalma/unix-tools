package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.CutLib;

public class Cut {
    public static void main(String[] args) {
        Cut cutclient = new Cut();
        if(args.length == 0){
            System.out.println("please give file name,fieldNo");
            return;
        }
        FileReader fs = new FileReader();
        CutLib cut = new CutLib();
        String properArgv[] = cutclient.getProperArgv(args);
        if(properArgv[0] == null && properArgv[1] == null || properArgv[0] != null && properArgv[1] == null) {
            String fileData = fs.readFile(properArgv[2]);
            System.out.println(fileData);
            return;
        }
        String delimitor = " ";
        if(properArgv[1] != null)
            delimitor = properArgv[1].substring(2);
        if(properArgv[0] != null && properArgv[1] != null){
            int fieldValue = Integer.parseInt(properArgv[0].substring(2));
            String fileData = fs.readFile(properArgv[2]);
            String columnData = cut.column(fieldValue, delimitor, fileData);
            System.out.println(columnData);
        }
    }

    String[] getProperArgv(String[] arg) {
        String options[] = new String[3];
        for (int i = 0; i < arg.length; i++) {
            if (Cut.isfieldValue(arg[i]))
                options[0] = arg[i];
            if (Cut.isDelimitor(arg[i]))
                options[1] = arg[i];
            if (!Cut.isFileName(arg[i]))
                options[2] = arg[i];
        }
        return options;
    }

    static boolean isDelimitor(String arg) {
        return arg.matches("-d.*");
    }

    static boolean isfieldValue(String arg) {
        return arg.matches("-f.*");
    }

    static boolean isFileName(String arg) {
        return arg.matches("-.*");
    }
}