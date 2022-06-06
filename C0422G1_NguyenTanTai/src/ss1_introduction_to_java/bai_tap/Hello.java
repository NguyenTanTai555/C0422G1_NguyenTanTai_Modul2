package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Enter name :");
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println(" Hello " + name);
    }
}
