package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {
        int number;
        System.out.println(" Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("fire");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("night");
                break;
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 20:
                System.out.println("twenty");
                break;
            case 13:
                System.out.println("");
        }
    }
}
