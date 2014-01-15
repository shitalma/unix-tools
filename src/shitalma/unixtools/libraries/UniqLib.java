package shitalma.unixtools.libraries;

public class UniqLib {
    public StringBuilder uniqData(String input) {
        String data[] = input.split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (int count = 0; count < data.length - 1; count++) {
            if (!(data[count].equalsIgnoreCase(data[count + 1])))
                stringBuilder.append(data[count]).append("\r\n");
        }
        return stringBuilder;
    }
}
