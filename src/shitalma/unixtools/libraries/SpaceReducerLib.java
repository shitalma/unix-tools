package shitalma.unixtools.libraries;

public class SpaceReducerLib {
        public String spaceReducer(String fileContent) {
            String[] result = fileContent.split("\r\n");
            StringBuilder data = new StringBuilder();
            for (int i = 0; i < result.length; i++)
                data.append(result[i].replaceAll("\\s+", " ")).append("\r\n");
            return data.toString();
        }
}