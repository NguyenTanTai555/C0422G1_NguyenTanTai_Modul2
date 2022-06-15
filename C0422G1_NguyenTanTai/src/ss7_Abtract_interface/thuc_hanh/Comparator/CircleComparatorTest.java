package ss7_Abtract_interface.thuc_hanh.Comparator;

import ss6_Inheritance.bai_tap.Circle_Cylynder.Circle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle []circles= new Circle[3];
        circles[0] = new Circle(3,"yellow");
        circles[1] = new Circle(3.0,"blue");
        circles[2] = new Circle();
        System.out.println("Pre-sorted :");
        for (Circle circle1: circles) {
            System.out.println(circle1);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After - sorted :");
        for (Circle circle2 : circles){
            System.out.println(circle2);
        }
    }
}
