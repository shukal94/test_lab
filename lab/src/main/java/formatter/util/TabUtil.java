package formatter.util;

public class TabUtil {

    public static String normalizeTabs(String input) {
        int length = input.length();

        StringBuilder result = new StringBuilder();
        int tabCount = 0;
        String tab = "";

        for (int i = 0; i < length; i++) {
            result.append(input.charAt(i));
            if (input.charAt(i) == '{') {
                tab = makeTab(++tabCount);
            } else if (input.charAt(i) == '\n') {
                result.append(tab);
            } else if (input.charAt(i) == '}') {
                tab = makeTab(--tabCount);
            }
        }

        return result.toString();
    }

    private static String makeTab(int tabCount) {
        StringBuilder tabs = new StringBuilder();
        for (int i = 0; i < tabCount; i++) {
            tabs.append("\t");
        }
        return tabs.toString();
    }

}
