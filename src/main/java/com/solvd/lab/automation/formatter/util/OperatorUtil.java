package com.solvd.lab.automation.formatter.util;

import com.solvd.lab.automation.formatter.lexem.Lexem;

public class OperatorUtil {
    public static String normalizePlus(String input) {
        return input.replace(Lexem.PLUS.getValueToMatch(), Lexem.PLUS.getValueToReplace());
    }

    public static String normalizeMinus(String input) {
        return input.replace(Lexem.MINUS.getValueToMatch(), Lexem.MINUS.getValueToReplace());
    }

    public static String normalizeMultiply(String input) {
        return input.replace(Lexem.MULTIPLY.getValueToMatch(), Lexem.MULTIPLY.getValueToReplace());
    }

    public static String normalizeDivide(String input) {
        return input.replace(Lexem.DIVIDE.getValueToMatch(), Lexem.DIVIDE.getValueToReplace());
    }

    public static String normalizeEq(String input) {
        return input.replace(Lexem.EQ.getValueToMatch(), Lexem.EQ.getValueToReplace());
    }

}
