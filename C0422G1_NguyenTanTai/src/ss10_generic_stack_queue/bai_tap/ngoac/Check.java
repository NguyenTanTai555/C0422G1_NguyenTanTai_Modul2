package ss10_generic_stack_queue.bai_tap.ngoac;

import java.util.Scanner;
import java.util.Stack;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression : ");
        Stack<Character> bStack = new Stack<>();
        String expression = scanner.nextLine();
        char leftBracket = '(';
        char rightBracket = ')';
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == leftBracket) {
                bStack.push(leftBracket);
            }
            if (expression.charAt(i) == rightBracket) {
                if (bStack.isEmpty()) {
                    bStack.push(expression.charAt(0));
                    break;
                } else {
                    if (bStack.peek() != expression.charAt(i)) {
                        bStack.pop();
                    }
                }
            }
        }
        if (bStack.isEmpty()) {
            System.out.println("Expression True");
        } else {
            System.out.println("Expression False");
        }
        System.out.println(expression);
        System.out.println(bStack);


    }
}
