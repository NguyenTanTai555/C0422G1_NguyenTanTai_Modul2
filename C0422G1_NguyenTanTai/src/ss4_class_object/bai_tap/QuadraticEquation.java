package ss4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return (b * 2) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(delta) / (2 * a));
    }

    public double getRoot2() {
        return (-b - Math.sqrt(delta) / (2 * a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c : ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDelta() > 0) {
            System.out.println("the equation has 2 solutions \n" + "Root 1 =" + quadraticEquation.getRoot1() + "\n" + "Root 2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("the equation have 1 solutions " + quadraticEquation.getRoot1());
        } else {
            System.out.println("the equation has no solution");
        }


    }
}