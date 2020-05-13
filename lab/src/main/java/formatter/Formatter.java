package formatter;

import formatter.util.*;

public class Formatter {
    public static void main(String[] args) {
        String input = "public class NoSuchTransport extends Exception{public NoSuchTransport(String message) {super(message);if(aaa){aaa+b=5;return b;}}}";
        input = BraceUtil.normalizeSharpBraces(input);

        input = OperatorUtil.normalizePlus(input);
        input = OperatorUtil.normalizeMinus(input);
        input = OperatorUtil.normalizeMultiply(input);
        input = OperatorUtil.normalizeDivide(input);
        input = OperatorUtil.normalizeEq(input);

        input = TabUtil.normalizeTabs(input);
        input = StatementUtil.normalizeSemicolons(input);

        System.out.println(input);

    }

//    public class NoSuchTransport extends Exception {
//        public NoSuchTransport(String message) {
//            super(message);
//            if (aaa) {
//                aaa + b = 5;
//                return b;
//            }
//        }
//    }


}
