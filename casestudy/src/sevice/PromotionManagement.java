package sevice;

import java.util.Scanner;

public class PromotionManagement {
    public static void PromotionManagement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
            case 2:
            case 3:
        }
    }
    public static void DisplayListCustomerUseService(){

    }
    public static void DisplayListCustomersGetVoucher(){

    }
}
