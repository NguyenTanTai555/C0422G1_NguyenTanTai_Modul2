package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class Print20PrimeNumber {
    public static void main(String[] args) {
        int number;
        int i = 2;
        int count = 1;
        int countPrime;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the quantity to be printed :");
            number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                System.out.println(" Please enter number >0");
            }
            if (number > 0) {
                while (count <= number) {
                    countPrime = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            countPrime++;
                        }
                    }
                    if (countPrime == 2) {
                        System.out.println(count+"."+i);
                        count++;
                    }
                    i++;
                }
            }
        }while (flag);
    }
}
