package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag){
            System.out.println("Menu"+
                    "\n 1 . Draw the triangle " +
                    "\n 2 . Draw the square " +
                    "\n 3 . Draw the rectangle " +
                    "\n 0 . Exit" +
                    "\n Enter the Number");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1 :
                    System.out.println("--- Draw the triangle ---" +
                            "\n * * * * * * *" +
                            "\n * * * * * *" +
                            "\n * * * * *" +
                            "\n * * * *" +
                            "\n * * *" +
                            "\n * *" +
                            "\n *" );
                    break;
                case 2:
                    System.out.println("--- Draw the square ---" +
                            "\n * * * * * * " +
                            "\n * * * * * * " +
                            "\n * * * * * * " +
                            "\n * * * * * * " +
                            "\n * * * * * * " +
                            "\n * * * * * * " );
                    break;
                case 3:
                    System.out.println("--- Draw the rectangle ---" +
                            "\n * * * * * *" +
                            "\n * * * * * *" +
                            "\n * * * * * *" );
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice !");
            }
        }

    }
}
