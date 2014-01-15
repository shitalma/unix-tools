package shitalma.unixtools.libraries;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortLib {
    public String sortData(String input){
        String lines[] = input.split("\n");
        Arrays.sort(lines);
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            result.append(line).append("\r\n");
        }
        return result.toString();
    }
    public String reverseData(String input){
        String data = sortData(input);
        String[] lines = data.split("\r\n");
        StringBuilder result = new StringBuilder();
        List<String> strList = Arrays.asList(lines);
        Collections.reverse(strList);
        lines = strList.toArray(new String[strList.size()]);
        for (String line : lines) {
            result.append(line).append("\r\n");
        }
        return result.toString();
    }
}