package shitalma.unixtools.libraries;

public class CutLib {
        public String cutSpecificCharacter(int number, String text) {
            String[] result = text.split("\r\n");
            StringBuilder charactersAfterCutting = new StringBuilder();
            for (int i = 0; i < result.length; i++)
                charactersAfterCutting.append(result[i].substring(number-1,number)).append("\r\n");
            return charactersAfterCutting.toString();
        }
        public String cutSpecificField(String text) {
            String[] result = text.split("\r\n");
            StringBuilder fields = new StringBuilder();
            for (String aResult : result)
                fields.append(aResult).append("\r\n");
            return fields.toString();
        }
        public String cutUsingSpecificFieldAndSeperator(int fieldNumber,String seperator,String text) {
            String[] result = text.split("\r\n");
            StringBuilder cut = new StringBuilder();
            for (String aResult : result) {
                String[] data = aResult.split(seperator);
                if (data.length < fieldNumber)
                    cut.append("\r\n");
                else cut.append(data[fieldNumber - 1]).append("\r\n");
            }
            return cut.toString();
        }
}
