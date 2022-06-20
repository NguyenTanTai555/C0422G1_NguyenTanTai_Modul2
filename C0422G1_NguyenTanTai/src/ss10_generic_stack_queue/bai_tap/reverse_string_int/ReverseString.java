package ss10_generic_stack_queue.bai_tap.reverse_string_int;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        int arrayLength = Integer.parseInt(sc.nextLine());
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("enter element " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("before reverse : " + Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();
        for (int i : array) {
            stack.push(i);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("after reverse :" + Arrays.toString(array));
        System.out.println();
        System.out.println("====================");
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackString = new Stack<>();
        System.out.println("Enter String :");
        String s = scanner.nextLine();
        String[] w = s.split("");
        for (int i = w.length - 1; i >= 0; i--) {
            stackString.push(w[i]);
        }
        for (int i = w.length - 1; i >= 0; i--) {
            System.out.println(stackString.pop());
        }
    }
}
