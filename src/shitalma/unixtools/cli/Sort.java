package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.MyFileReader;
import shitalma.unixtools.libraries.sortLib;

import java.io.IOException;

public class Sort {
    public static void main(String args[]) throws IOException {
        Sort sortclient = new Sort();
        MyFileReader fs = new MyFileReader();
        sortLib sort = new sortLib();
        String columnData;
        String properArgv[] = sortclient.getArguments(args);
        String fileData = fs.readFile(properArgv[0]);
        if (properArgv[1] == null)
            columnData = sort.sortData(fileData);
        else
            columnData = sort.reverseData(fileData);
        System.out.println(columnData);
    }

    String[] getArguments(String[] arg) {
        String options[] = new String[2];
        for (int i = 0; i < arg.length; i++) {
            if (Sort.isReverse(arg[i]))
                options[1] = arg[i];
            if (!Sort.isFile(arg[i]))
                options[0] = arg[i];
        }
        return options;
    }

    static boolean isReverse(String arg) {
        return arg.matches("-r.*");
    }

    static boolean isFile(String arg) {
        return arg.matches("-.*");
    }
}