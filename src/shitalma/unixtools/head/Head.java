package shitalma.unixtools.head;

import shitalma.unixtools.FileReader;

public class Head {
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
        HeadLib head = new HeadLib(length,fileData);
        String lines = head.display_head();
        String[] result = lines.split("\r\n");
        StringBuilder sb = new StringBuilder();
        for (String line : result) {
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}