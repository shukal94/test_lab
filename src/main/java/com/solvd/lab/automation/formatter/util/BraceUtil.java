package com.solvd.lab.automation.formatter.util;

import com.solvd.lab.automation.formatter.lexem.Lexem;

public class BraceUtil {
    public static String normalizeSharpBraces(String input) {
        input = input.replace(Lexem.SHARP_BR_BEGIN.getValueToMatch(), Lexem.SHARP_BR_BEGIN.getValueToReplace());
        return input.replace(Lexem.SHARP_BR_END.getValueToMatch(), Lexem.SHARP_BR_END.getValueToReplace());
    }
}
