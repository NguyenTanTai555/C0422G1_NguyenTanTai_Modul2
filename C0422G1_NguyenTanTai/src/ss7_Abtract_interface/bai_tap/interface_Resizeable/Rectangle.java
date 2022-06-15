package ss7_Abtract_interface.bai_tap.interface_Resizeable;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width , double length){
        this.width = width ;
        this.length = length;
    }
    public Rectangle(double width , double height ,String color , boolean filled){
        super(color,filled);
        this.width =width;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2*(width+ length);
    }
    @Override
    public String toString(){
        return "A Rectangle with width=" +
                getWidth() + "\n" +
                "and length " +
                getLength() + "\n" +
                "which is a subclass of " +
                super.toString();

    }

    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth()+(1+(percent/100)));
        this.setLength(this.getLength()+(1+(percent/100)));
    }

    @Override
    public void howToColor() {

    }
}
