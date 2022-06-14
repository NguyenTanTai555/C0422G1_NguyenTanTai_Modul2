package ss6_Inheritance.bai_tap.Point_MovablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float x) {
        this.xSpeed = x;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float y) {
        this.ySpeed = y;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = {this.xSpeed, this.ySpeed};
        return array;
    }

    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                xSpeed + "," +
                ySpeed +
                ')';
    }

}
