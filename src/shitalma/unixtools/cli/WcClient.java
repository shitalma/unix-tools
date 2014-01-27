package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.MyFileReader;
import shitalma.unixtools.libraries.WcLib;

public class WcClient {
    public static void main(String[] args) {
        MyFileReader readContent = new MyFileReader();
        WcClient wc = new WcClient();
        String[] processArgs = wc.getParameters(args);
        String fileData = readContent.readFile(processArgs[3]);
        if(0 == fileData.compareTo("file not found")) return;
        WcLib operations = new WcLib(fileData);
        int characters;
        int words;
        int lines;
        if(processArgs[0] != null) {
            characters = operations.countCharacters();
            System.out.print(characters + " ");
        }
        if(processArgs[1] != null){
            words = operations.countWords();
            System.out.print(words+ " ");
        }
        if(processArgs[2] != null){
            lines = operations.countLines();
            System.out.print(lines + " ");
        }
        if(processArgs[0] == null && processArgs[1] == null && processArgs[2] == null){
            characters = operations.countCharacters();
            words = operations.countWords();
            lines = operations.countLines();
            System.out.print(characters+" "+words+" "+lines+" ");
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