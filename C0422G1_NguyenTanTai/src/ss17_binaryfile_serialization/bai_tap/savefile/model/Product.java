package ss17_binaryfile_serialization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSp ;
    private String tenSp ;
    private String hangSx ;
    private double price ;

    public Product() {
    }

    public Product(int maSp, String tenSp, String hangSx, double price) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.hangSx = hangSx;
        this.price = price;

    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "maSp=" + maSp +
                ", tenSp='" + tenSp + '\'' +
                ", hangSx='" + hangSx + '\'' +
                ", price=" + price +
                '}';
    }
}
