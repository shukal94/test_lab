package com.solvd.lab.automation.formatter.util;

import com.solvd.lab.automation.formatter.lexem.Lexem;

public class StatementUtil {
    /**
     * @param input like 'if(a)' will turn into
     * @return 'if (a)'
     */
    public static String normalizeIfs(String input) {
        return input.replace(Lexem.IF_ST.getValueToMatch(), Lexem.IF_ST.getValueToReplace());
    }

    /**
     * @param input like 'for(a)' will turn into
     * @return 'for (a)'
     */
    public static String normalizeFors(String input) {
        return input.replace(Lexem.FOR_ST.getValueToMatch(), Lexem.FOR_ST.getValueToReplace());
    }

    /**
     * @param input like 'a = a+b;a = a-b' will turn into
     * @return 'a = a+b;'
     *         'a = a-b;'
     */
    public static String normalizeSemicolons(String input) {
        return input.replace(Lexem.SEMICOLON_ST.getValueToMatch(), Lexem.SEMICOLON_ST.getValueToReplace());
    }
}
