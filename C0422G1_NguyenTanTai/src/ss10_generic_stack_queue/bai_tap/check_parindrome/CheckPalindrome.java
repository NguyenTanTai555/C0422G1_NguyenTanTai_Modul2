package ss10_generic_stack_queue.bai_tap.check_parindrome;

import java.util.*;


public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String :");
        String string = scanner.nextLine();
        Stack<Character> stringStack = new Stack<>();
        Queue<Character> stringQueue = new ArrayDeque<>();
        for (int i = 0; i < string.length(); i++) {
            stringStack.push(string.toLowerCase().charAt(i));
            stringQueue.offer(string.toLowerCase().charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < string.length(); i++) {
            if (stringStack.pop() != stringQueue.poll()) {
                System.out.println("String not palindrome!!!!");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("String is Palindrome ");
        }
    }
}
