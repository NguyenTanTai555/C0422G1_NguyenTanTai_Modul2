package ss4_class_object.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 1;
    final int FAST = 3;
    int speed ;
    boolean on;
    double radius ;
    String color ;

    public Fan() {
        speed = SLOW;
        radius = 5;
        color = "Blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return this.on ;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (!isOn()) {
            return "Speed : " + this.getSpeed() +"\n"+ "Color : " + this.getColor() + this.getRadius() + "Fan is of";
        } else {
            return "Color: " +this.getColor() +"\n"+ this.getRadius() + "\n"+" Fan is on";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
