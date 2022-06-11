package ss4_class_object.thuc_hanh;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Adidas {
    private String name ;
    private double price;
    private String color;
    private String form;
    private double amountSold;
    private String category;
    private double size;

    public Adidas() {
    }

//    public Adidas(double price, double color, double form, double amountSold, String category) {
//        this.price = price;
//        this.color = color;
//        this.form = form;
//        this.amountSold = amountSold;
//        this.category = category;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public String getColor() {
//        return color;
//    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public double getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(double amountSold) {
        this.amountSold = amountSold;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void main(String[] args) {
        Adidas adidas = new Adidas();
        adidas.setName("Jordan 11");
        adidas.setColor("White");
        System.out.println(adidas.color + "\n" + adidas.getName());


    }
}

