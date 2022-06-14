package ss6_Inheritance.bai_tap.Circle_Cylynder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public String volume(){
        return "V of cylinder = " + Math.PI*Math.pow(radius,2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }
}
