package com.solvd.lab.automation.formatter.util;

import com.solvd.lab.automation.formatter.constant.JavaLangConstant;

import java.util.StringTokenizer;


public class TabUtil {

    /**
     * makes a string of proper count of tabs
     *
     * @param tabCount - number of tabs needed
     * @return - String of tabs
     */
    private static String makeTab(int tabCount) {
        String tabs = "";
        for (int i = 0; i < tabCount; i++){
            tabs += "\t";
        }
        return tabs;
    }

    /**
     * normalizes tabs in a string :
     *      after each `{` tab Count increases
     *      after each `}` tab Count decreases
     *      after new line tabs added
     * @param input
     * @return
     */
    public static String normalizeTabs(String input){
        int length = input.length();

        String result = "";
        int tabCount = 0;
        String tabs = "";

        char ch;

        for (int i = 0; i < length; i++) {
            ch = input.charAt(i);
            result += ch;
            if (ch == '{'){
                tabs = makeTab(++tabCount);
            } else if (ch == '\n') {
                result += tabs;
            } else if (ch == '}') {
                tabs = makeTab(--tabCount);
            }
        }

        return result;
    }
}