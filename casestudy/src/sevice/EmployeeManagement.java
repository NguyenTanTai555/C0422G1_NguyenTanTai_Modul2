package sevice;

import java.util.Scanner;

public class EmployeeManagement {
    public static void EmployeeManagement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee Management :" +
                "\n1.Display list employees" +
                "\n2.Add new employee"+
                "\n3.Edit employee"+
                "\n4.Return MainMenu");
        int choose= Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1 :

                break;
            case 2 :
                break;
        }
    }

    public static void displayEmployee() {
        Scanner scanner = new Scanner(System.in);

    }

    public static void addNewEmployee() {

    }
}
