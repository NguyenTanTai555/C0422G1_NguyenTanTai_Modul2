package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number check Prime or Not");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2;
        int count = 0;
        if (number >= 2) {
            while (i <= number / 2) {
                if (number % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0) {
                System.out.println("number is Prime");
            } else {
                System.out.println("number is Not Prime");
            }
        } else {
            System.out.println("number is Not Prime");
        }
    }
}
