package shitalma.unixtools.wc;

public class WC {
    public int countLines (String text) {
        String[] res = text.split("\n");
        return res.length;
    }
    public int countWords (String text) {
        String[] res = text.split(" ");
        return res.length;
    }
    public int countCharacters (String text) {
        String[] res = text.split("");
        return res.length;
    }
}
