package shitalma.unixtools.libraries;

public class TailLib {
    private String text;
    private int limit;

    public TailLib(int noOfLines, String text) {
        this.text = text;
        this.limit = noOfLines;
    }

    public String display_tail() {
        String[] lines = text.split("\r\n");
        if (lines.length < limit) return text.toString();
        StringBuilder result = new StringBuilder();
        for (int i = (lines.length - limit); i < lines.length-1; i++)
            result.append(lines[i]).append("\r\n");
        result.append(lines[lines.length-1]);
        return result.toString();
    }
}