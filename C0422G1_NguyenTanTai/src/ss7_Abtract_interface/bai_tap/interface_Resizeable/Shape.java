package ss7_Abtract_interface.bai_tap.interface_Resizeable;

import ss7_Abtract_interface.bai_tap.interface_Colorable.Colorable;

public abstract class Shape implements Resizeable ,Colorable{
    String color = "green";
    boolean filled = true ;
    public Shape(){
    }
    public Shape(String color , boolean filled){
        this.color = color;
        this.filled= filled;
    }
    public abstract double getArea();
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A shape with color "+"\n"+
                getColor()+ "\n" + "and "+ (isFilled()?"filled" : "not filled");
    }



}
