package ss7_Abtract_interface.bai_tap.interface_Resizeable;


public class TestReSizeable {
    public static void main(String[] args) {
        double percent = Math.floor(Math.random()*100 +1)/100;
        Shape[]shapes = new Shape[4];
        Circle circle = new Circle(4);
        Square square = new Square(3);
        Square square1 = new Square(4);
        Rectangle rectangle =new Rectangle(4,3);
        shapes[0] =  circle;
        shapes[1] = square;
        shapes[2] = square1;
        shapes[3] = rectangle;
        System.out.println("Area before change :");
        for (Shape s: shapes) {
            System.out.println(s);
            System.out.println(s.getArea());
        }
        System.out.println();
        for (Shape s: shapes) {
//  s đang thuộc shape , nếu shape ko triển khai resizeable thì bắt buộc phải ép kiểu .
//            if (s instanceof  Square){
//                ((Square)s).resize(5);
//            }
            s.resize(percent);
            System.out.println(s);
            System.out.println("After resize");
            System.out.println(s.getArea());
        }

    }
}