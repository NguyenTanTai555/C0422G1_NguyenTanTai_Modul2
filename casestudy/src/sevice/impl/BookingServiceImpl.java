package sevice;

import java.util.Scanner;

public class BookingService {
    public static void BookingService(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
        }
    }
    public static void DisplayListBooking(){

    }
    public static void CreateNewContracts(){

    }
    public static void EditContracts(){

    }
}
