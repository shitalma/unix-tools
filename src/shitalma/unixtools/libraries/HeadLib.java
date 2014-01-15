package shitalma.unixtools.libraries;

public class HeadLib {
    private String text;
    private int limit;

    public HeadLib(int noOfLines, String text) {
        this.text = text;
        this.limit = noOfLines;
    }

    public String display_head() {
        String[] lines = text.split("\r\n");
        if (lines.length < limit) limit = lines.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < limit; i++)
            result.append(lines[i]).append("\r\n");
        return result.toString();
    }
}

