package shitalma.unixtools.libraries;

public class UniqLib {
    public String text;
    public UniqLib(String text) {
        this.text = text;
    }
    public StringBuilder uniqData() {
        String data[] = text.split("\r\n");
        int length = data.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int count = 0; count < data.length - 1; count++) {
            if (!(data[count].equalsIgnoreCase(data[count + 1])))
                stringBuilder.append(data[count]).append("\r\n");
        }
        stringBuilder.append(data[length-1]);
        return stringBuilder;
    }
}
