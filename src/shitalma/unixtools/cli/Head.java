package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.HeadLib;

public class Head {
    public static void main(String[] args) {
        int length = 10;
        String fileName=args[0];
        String fileData;
        StringBuilder sb = new StringBuilder();

        Head head = new Head();
        FileReader readContent = new FileReader();

        String[] processArgs = head.getParameters(args);
        if(processArgs[1] != null) {
            length = Math.abs(Integer.parseInt(processArgs[1]));
            fileName = processArgs[0];
        }
        fileData = readContent.readFile(fileName);
        HeadLib headLib = new HeadLib(length,fileData);
        String lines = headLib.display_head();
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
            if(Head.isNumber(args[i]))
                options[1] = args[i];
            if(!Head.isNumber(args[i]))
                options[0] = args[i];
        }
        return options;
    }
    static boolean isNumber(String arg) {
        return arg.matches("-.*");
    }
}