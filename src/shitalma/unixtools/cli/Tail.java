package shitalma.unixtools.cli;

import shitalma.unixtools.filesystem.MyFileReader;
import shitalma.unixtools.libraries.TailLib;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Tail {
    public static void main(String[] args) {
        int length;
        String fileName = args[0];
        String fileData;
        StringBuilder sb = new StringBuilder();

        Tail tail = new Tail();
        MyFileReader readContent = new MyFileReader();

        String[] processArgs = tail.getParameters(args);
        if (processArgs[1] != null) {
            length = Math.abs(Integer.parseInt(processArgs[1]));
            fileName = processArgs[0];
        }
        else {
            try  {
                FileReader reader = new FileReader(System.getenv("UNIXTOOLS_SH")+"/lib/config.property");
                Properties properties = new Properties();
                properties.load(reader);
                length = Integer.parseInt(properties.getProperty("default.tail.properties"));
            } catch (FileNotFoundException e) {
                length = 10;
            } catch (IOException e) {
                length = 10;
            }
        }
        fileData = readContent.readFile(fileName);
        TailLib headLib = new TailLib(length, fileData);

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
        for (int i = 0; i < args.length; i++) {
            if (Tail.isNumber(args[i]))
                options[1] = args[i];
            if (!Tail.isNumber(args[i]))
                options[0] = args[i];
        }
        return options;
    }
    static boolean isNumber(String arg) {
        return arg.matches("-.*");
    }
}