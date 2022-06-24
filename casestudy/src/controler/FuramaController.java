package controler;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("1.Employee Management" +
                    "\n2.Customer Management" +
                    "\n3.Facility Management" +
                    "\n4.Booking Management" +
                    "\n5.Promotion Management" +
                    "\n6.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Goodbye , See you later !!!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Please re enter");
            }
        } while (flag);
    }
}
