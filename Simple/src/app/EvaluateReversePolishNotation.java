package app;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack1 = new Stack<>();

        for (String str : tokens) {

            if("+-*/".contains(str)) {

                stack1.push(evaluate(stack1.pop(), stack1.pop(), str));

            } else {
                stack1.push(Integer.parseInt(str));
            }

        }

        return stack1.pop();
        
    }

    private int evaluate(int op2, int op1, String op) {

        if ("+".equals(op)) {
            return op1 + op2;
        } else if ("-".equals(op)) {
            return op1 - op2;
        } else if ("*".equals(op)) {
            return op1 * op2;
        } else {
            return op1 / op2;
        }

    }

}
