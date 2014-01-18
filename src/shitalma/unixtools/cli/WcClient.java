package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.FileReader;
import shitalma.unixtools.libraries.WcLib;

public class WcClient {
    public static void main(String[] args) {
        FileReader readContent = new FileReader();
        WcClient wc = new WcClient();
        String[] processArgs = wc.getParameters(args);
        String fileData = readContent.readFile(processArgs[3]);
        WcLib operations = new WcLib(fileData);
        if(processArgs[0] != null) {
            int characters = operations.countCharacters();
            System.out.print(characters + " ");
        }
        if(processArgs[1] != null){
            int words = operations.countWords();
            System.out.print(words+ " ");
        }
        if(processArgs[2] != null){
            int lines = operations.countLines();
            System.out.print(lines + " ");
        }
        System.out.print(processArgs[3].substring(processArgs[3].length()-5,processArgs[3].length()));
    }
    String[] getParameters(String[] args) {
        String[] options = new String[4];
        for (int i = 0; i < args.length; i++) {
            if (WcClient.isCharacters(args[i]))
                options[0] = args[i];
            if (WcClient.isWords(args[i]))
                options[1] = args[i];
            if (WcClient.isLines(args[i]))
                options[2] = args[i];
            if (!WcClient.isFile(args[i]))
                options[3] = args[i];
        }
        return options;
    }

    static boolean isCharacters(String arg) {
        return arg.matches("-c");
    }
    static boolean isWords(String arg) {
        return arg.matches("-w");
    }
    static boolean isLines(String arg) {
        return arg.matches("-l");
    }
    static boolean isFile(String arg) {
        return arg.matches("-.*");
    }
}