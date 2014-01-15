package shitalma.unixtools.libraries;

public class CutLib {
    public String text;
    public int fieldValue;
    public String delimiter;
    public CutLib(int fieldValue,String delimiter,String text) {
        this.fieldValue = fieldValue;
        this.delimiter = delimiter;
        this.text = text;
    }

    public String cutContent() {
        StringBuilder result = new StringBuilder();
        String lines[] = text.split("\r\n");
        System.out.println(lines);
        String words_a_line[];
        for (int counter = 0; counter < lines.length; counter++) {
            words_a_line = lines[counter].split(delimiter);
            result.append(words_a_line[fieldValue]);
            result.append("\r\n");
        }
        return result.toString();
    }
}