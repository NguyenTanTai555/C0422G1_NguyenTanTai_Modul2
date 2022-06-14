package ss6_Inheritance.bai_tap.Circle_Cylynder;

public class Circle {
    String color ;
    double radius;
    public Circle(){
    }
    public Circle(double radius , String color){
        this.radius = radius ;
        this.color = color ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getArea(){
        return "Area of Circle= "+(Math.pow(this.radius, 2)) * (Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
