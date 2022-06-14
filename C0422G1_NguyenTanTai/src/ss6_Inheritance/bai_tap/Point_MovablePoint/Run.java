package ss6_Inheritance.bai_tap.Point_MovablePoint;

public class Run {
    public static void main(String[] args) {
        Point point = new Point(3.0f,2.0f);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(2.0f,3.0f,2.0f,3.0f);
        System.out.println(movablePoint);
        movablePoint.setSpeed(5.0f,2.0f);
        System.out.println(movablePoint.move());
//        ép kiểu
////        Point point = new MovablePoint(3.0f,2.0f,1.0f,5.0f);
////        System.out.println(((MovablePoint)point).move());
    }
}
