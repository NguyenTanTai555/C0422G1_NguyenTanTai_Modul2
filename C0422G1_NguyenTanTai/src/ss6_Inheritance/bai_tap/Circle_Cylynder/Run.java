package ss6_Inheritance.bai_tap.Circle_Cylynder;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5 , "pink");
        Cylinder cylinder = new Cylinder(2.5,"red",5);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(cylinder.toString());
        System.out.println(cylinder.volume());

    }
}
