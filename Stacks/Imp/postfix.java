package Imp;

import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = "9-(5+3)*4/6";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            } else if (op.isEmpty() || op.peek() == '(' || ch == '(')
                op.push(ch);

            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(v1 + v2 + o);
                }
                op.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(v1 + v2 + o);
                    op.push(ch);

                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        val.push(v1 + v2 + o);
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            val.push(v1 + v2 + o);

        }

        String a = val.pop();
        System.out.println(a);
    }
}
