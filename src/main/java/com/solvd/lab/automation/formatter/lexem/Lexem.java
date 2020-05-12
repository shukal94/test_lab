package com.solvd.lab.automation.formatter.lexem;

public enum Lexem {
    SHARP_BR_BEGIN("{", " {\n"),
    SHARP_BR_END("}", "}\n"),
    IF_ST("if(", "\nif ("),
    FOR_ST("for(", "for ("),
    SEMICOLON_ST(";", ";\n"),
    PLUS("+", " + "),
    MINUS("-", " - "),
    MULTIPLY("*", " * "),
    DIVIDE("/", " / "),
    EQ("=", " = ");

    private String valueToMatch;
    private String valueToReplace;

    Lexem(String valueToMatch, String valueToReplace) {
        this.valueToMatch = valueToMatch;
        this.valueToReplace = valueToReplace;
    }

    public String getValueToMatch() {
        return valueToMatch;
    }

    public String getValueToReplace() {
        return valueToReplace;
    }
}
