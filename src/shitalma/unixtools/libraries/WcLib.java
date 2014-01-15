package shitalma.unixtools.libraries;

public class WcLib {
    String text;

    public WcLib(String text) {
        this.text = text;
    }

    public int countWords() {
        return text.split("\\w+").length-1;
    }

    public int countLines() {
        return text.split("\r\n").length - 1;
    }

    public int countCharacters() {
        return text.length() -1;
    }
}