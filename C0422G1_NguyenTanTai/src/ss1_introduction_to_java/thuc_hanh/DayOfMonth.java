package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month :");
        month = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month "+ month + "Have 31 days");
                break;
            case 2:
                System.out.println("Month"+ month + "Have 28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month"+ month + "Have 30 days");
                break;
            default:
                System.out.println("Not the Month!!!");
        }

    }
}
