package sevice;

import java.util.Scanner;

public class CustomerManagement {
    public static void CustomerManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Customer Management :" +
                "\n1.Display list customer"+
                "\n2.Add new customer"+
                "\n3.Edit customer"+
                "\n4.Return main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
            case 2:
            case 3:
            case 4:
        }
    }
    public static void DisplayListCustomers(){

    }
    public static void AddNewCustomers(){

    }
    public static void EditCustomers(){

    }



}
