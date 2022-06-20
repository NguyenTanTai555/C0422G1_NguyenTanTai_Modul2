package ss10_generic_stack_queue.bai_tap.change;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter decimal number :");
        int number = Integer.parseInt(scanner.nextLine());
        while (number != 0) {
            int d = number % 2;
            stack.push(d);
            number /= 2;
        }
        System.out.println("\n Binary representation is :");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
