package ss6_Inheritance.bai_tap.Point2D_Point3D;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2.0f,3.0f);
        Point3D point3D = new Point3D();
        point3D.setXYZ(2.0f,3.0f,4.0f);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));
        point2D.getXY();

    }
}
