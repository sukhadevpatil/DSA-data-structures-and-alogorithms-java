package datastructures.parenthesesbalanced;

import datastructures.stackgenerictype.Stack;

public class ParenthesesBalanced {

    public static void main(String[] args) {
        System.out.println(isBalancedParentheses("()"));
        System.out.println(isBalancedParentheses("((())"));
        System.out.println(isBalancedParentheses("((())))"));
    }

    public static boolean isBalancedParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (char p : parentheses.toCharArray()) {
            if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
