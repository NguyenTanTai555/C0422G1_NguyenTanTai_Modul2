package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
        int number = 2;
        int count;
        System.out.println("Print Prime number < 100");
        while (number < 100) {
            count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);
            }
            number++;
        }
    }
}
