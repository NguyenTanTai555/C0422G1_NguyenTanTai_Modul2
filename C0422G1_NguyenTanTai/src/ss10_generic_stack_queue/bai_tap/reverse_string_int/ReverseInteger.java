package ss10_generic_stack_queue.bai_tap.reverse_string_int;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length :");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        int [] array = new  int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter element at  " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("before reverse :" + Arrays.toString(array));
        Stack<Integer> reverseArray = new Stack<>();
        for (int element :array) {
            reverseArray.add(element);
        }
        for (int i = 0; i < arrayLength; i++) {
            array[i] = reverseArray.pop();
        }
        System.out.println("after reverse :" + Arrays.toString(array));
        for (int i = reverseArray.size(); i > 0  ; i--) {
            System.out.println(reverseArray.pop());
        }
    }
}
