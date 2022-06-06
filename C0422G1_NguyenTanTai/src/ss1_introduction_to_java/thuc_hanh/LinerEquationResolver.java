package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LinerEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Give a equation as 'a * x + b = 0 , please enter constants");
        double a, b, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a :");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number b :");
        b = Double.parseDouble(scanner.nextLine());
        if (a != 0) {
            x = -b / a;
            System.out.println("Equation has 1 solution = " + x);
        } else if (b == 0) {
            System.out.println("Equation has infinitely many solutions");
        } else {
            System.out.println(" Equation has no solution");
        }

    }

}
