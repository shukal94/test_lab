package formatter.util;

public class StatementUtil {

    public static String normalizeSemicolons(String input){

        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ';') {
                input = input.subSequence(0, i + 1) + "\n" + input.subSequence(i + 1, input.length());
            }
        }
        return input;
    }
}
