package ss6_Inheritance.thuc_hanh;

public class Shape {
    String color = "green";
    boolean filled = true ;
    public Shape(){

    }
    public Shape(String color , boolean filled){
        this.color = color;
        this.filled= filled;
    }

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