package shitalma.unixtools.libraries;

public class CutLib {
    public static String column(int field_value, String delimitor, String fileData) {
        StringBuilder result = new StringBuilder();
        String lines[] = fileData.split("\r\n");
        if(lines.length < field_value)  return result.toString();
        String words_a_line[];
        for (int counter = 0; counter < lines.length; counter++) {
            words_a_line = lines[counter].split(delimitor);
            result.append(words_a_line[field_value - 1]);
            result.append("\n");
        }
        return result.toString();
    }
}