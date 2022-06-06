package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year :");
        year = Integer.parseInt(scanner.nextLine());
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(" Year " + year + " Is a leap year ");
                } else {
                    System.out.println(" Year " + year + " Not a lear year");
                }
            } else {
                System.out.println(" Year " + year + " Is a leap year ");
            }
        } else {
            System.out.println(" Year " + year + " Not a leap year ");
        }
    }
}
