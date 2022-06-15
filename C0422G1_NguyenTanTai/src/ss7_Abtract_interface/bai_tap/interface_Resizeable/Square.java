package ss7_Abtract_interface.bai_tap.interface_Resizeable;

import ss7_Abtract_interface.bai_tap.interface_Colorable.Colorable;

public class Square extends Rectangle implements Resizeable , Colorable {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);

    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getArea(){
        return  getSide()*getSide() ;
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide() + "\n"
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()+(1+(percent/100)));
    }
}
