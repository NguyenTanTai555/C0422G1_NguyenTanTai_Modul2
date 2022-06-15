package ss7_Abtract_interface.bai_tap.interface_Colorable;

import ss7_Abtract_interface.bai_tap.interface_Resizeable.Circle;
import ss7_Abtract_interface.bai_tap.interface_Resizeable.Rectangle;
import ss7_Abtract_interface.bai_tap.interface_Resizeable.Shape;
import ss7_Abtract_interface.bai_tap.interface_Resizeable.Square;

public class Test {
    public static void main(String[] args) {
        double percent = Math.floor(Math.random()*100 +1)/100;
        Shape[] shapes = new Shape[4];
        Square square = new Square(5);
        Square square1 = new Square(4);
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(6, 3);
        shapes[0] = square;
        shapes[1] = square1;
        shapes[2] = circle;
        shapes[3] = rectangle;
        for (Shape s : shapes) {
            System.out.println(s);
        }
        for (Shape s : shapes) {
            if (s instanceof Square){
                s.howToColor();
            }
            System.out.println(s.getArea());
        }
    }
}
