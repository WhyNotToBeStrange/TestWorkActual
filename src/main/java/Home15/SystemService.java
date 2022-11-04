package Home15;

import java.util.*;

public class SystemService {
        final static int swift = 48;
        public static void main(String[] args) {


        String infix = "25-2";
        System.out.println(infix);
        System.out.println(postfixEval(toPostfix(infix)));

    }

    public static List toPostfix(String infix) {
        List<Character> result = new ArrayList<Character>();
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for (Character operator : infix.toCharArray()) {
            if (Character.isAlphabetic(operator) || Character.isDigit(operator)) {
                result.add(operator);
            } else if (operator == '(') {
                stack.push(operator);
            } else if (operator == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.add(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && (precedence(operator) <= precedence(stack.peek()))) {
                    result.add(stack.pop());
                }
                stack.push(operator);
            }
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop());

        }
        return result;
    }

    public static int postfixEval(List<Character> postfix) {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for (Character operator : postfix) {
            if (Character.isDigit(operator)) {
                stack.push(operator);
            } else {
                stack.push(calculate(stack.pop(), stack.pop(), operator));
            }
        }
        return stack.pop() - swift;
    }

    private static int convert(Character character) {
        return character - swift;
    }

    private static Character calculate(Character first, Character second, Character mathOperator) {
        int result = 0;

        switch (mathOperator) {
            case '*':
                result = convert(first) * convert(second);
                break;
            case '/':
                if (convert(second) != 0) {
                    result = convert(first) / convert(second);
                } else {
                    result = 0;
                }
                break;
            case '+':
                result = convert(first) + convert(second);
                break;
            case '-':
                result = convert(first) - convert(second);
                break;
        }
        return (char) (result + swift);
    }

    private static int precedence(Character operator) {
        if ((operator == '*') || (operator == '/')) {
            return 3;
        } else if ((operator == '+') || (operator == '-')) {
            return 2;
        } else {
            return 1;
        }
    }

}
