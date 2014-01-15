package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.TailLib;

public class Tail {
    public static void main(String[] args) {
        int length = 10;
        String fileName=args[0];
        String fileData;
        StringBuilder sb = new StringBuilder();

        Tail tail = new Tail();
        FileReader readContent = new FileReader();

        String[] processArgs = tail.getParameters(args);
        if(processArgs[1] != null) {
            length = Math.abs(Integer.parseInt(processArgs[1]));
            fileName = processArgs[0];
        }
        fileData = readContent.readFile(fileName);
        TailLib headLib = new TailLib(length,fileData);
        String lines = headLib.display_tail();
        String[] result = lines.split("\r\n");
        for (String line : result) {
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    String[] getParameters(String[] args) {
        String[] options = new String[2];
        for (int i = 0; i <args.length ; i++) {
            if(Tail.isNumber(args[i]))
                options[1] = args[i];
            if(!Tail.isNumber(args[i]))
                options[0] = args[i];
        }
        return options;
    }
    static boolean isNumber(String arg) {
        return arg.matches("-.*");
    }
}