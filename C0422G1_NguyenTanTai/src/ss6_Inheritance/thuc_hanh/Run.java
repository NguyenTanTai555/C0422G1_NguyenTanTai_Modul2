package ss6_Inheritance.thuc_hanh;

public class Run {
    public static void main(String[] args) {
        Shape shape = new Shape("red" , true);
        Circle circle = new Circle(3.0 , "blue" ,false);
        Rectangle rectangle = new Rectangle(3.0 , 2.0,"blue",true);
        Square square = new Square(3 , "green",true);
        System.out.println(shape.toString());
        System.out.println(shape.isFilled());
        System.out.println(circle.toString());
        System.out.println(circle.getRadius()+"\n" +circle.getPerimeter());
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getArea() + "\n" + rectangle.getPerimeter());
        System.out.println(square.toString());
        System.out.println(square.getArea());
    }
}
