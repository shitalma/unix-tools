package shitalma.unixtools.cli;

import shitalma.unixtools.fileSystem.FileReader;
import shitalma.unixtools.libraries.TailLib;

public class Tail {
    public static void main(String[] args) {
        FileReader readContent = new FileReader();
        int length = 10;
        String fileData;
        String fileName = args[0];
        if(args.length == 2){
            length = Math.abs(Integer.parseInt(args[0]));
            fileName = args[1];
        }
        fileData = readContent.readFile(fileName);
        TailLib head = new TailLib(length,fileData);
        String lines = head.display_tail();
        String[] result = lines.split("\r\n");
        StringBuilder sb = new StringBuilder();
        for (String line : result) {
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}