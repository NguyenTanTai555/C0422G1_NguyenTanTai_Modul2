package ss4_class_object.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle {" + "width" + width + "height" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height :");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the width :");
        double width = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Your rectangle : \n " + rectangle.display());
        System.out.println("Area rectangle : \n " + rectangle.getArea());
        System.out.println("Perimeter rectangle : \n" + rectangle.getPerimeter());
    }
}

