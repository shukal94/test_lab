package com.solvd.lab.automation.formatter.util;

import java.util.StringTokenizer;

public class SpaceUtil {
    /**
     * @param input like " dsfsdf sd   dsfsdf   dsf  sdf  " will turn into
     * @return "dsfsdf sd dsfsdf dsf sdf"
     */
    public static String normalizeSpaces(String input) {
        StringTokenizer st = new StringTokenizer(input, " ");
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreElements()) {
            sb.append(st.nextElement()).append(" ");
        }

        String nameWithProperSpacing = sb.toString();

        return nameWithProperSpacing.trim();
    }
}
