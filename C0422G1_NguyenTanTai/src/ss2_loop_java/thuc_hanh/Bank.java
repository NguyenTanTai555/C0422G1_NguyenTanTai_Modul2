package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double money, interestRate, total = 0;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount : ");
        money = input.nextDouble();
        System.out.println("Enter number of Month: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage");
        interestRate = input.nextDouble();
        for (int i = 0; i <= month; i++) {
            total += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("total InterestRate :" + total);
    }
}
