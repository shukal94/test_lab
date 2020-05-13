package formatter.util;

public class BraceUtil {

    public static String normalizeSharpBraces(String input) {

        String result = "";

        String[] str = input.split(result);
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("{") ) {
                str[i] = str[i] + "\n";
            }else if (str[i].equals("}")){
                str[i] = "\n}";
            }
            result = result.concat(str[i]);
        }
        return result;
    }
}

