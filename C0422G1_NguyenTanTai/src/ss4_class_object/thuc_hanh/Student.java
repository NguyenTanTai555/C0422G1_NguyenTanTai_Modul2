package ss4_class_object.thuc_hanh;

import java.util.Scanner;

public class Student {
    private String name ;
    private int age;
    private String address;
    private boolean gender ;
    public Student() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String gender(){
        if (!isGender()) {
            return "Female ";
        } else {
            return "Male" ;
        }
    }
    public void display(){
        System.out.println( "Gender : " + this.gender());
        System.out.println("Name : " + this.getName());
        System.out.println("Age : " + this.getAge());
        System.out.println("Address : " + this.getAddress());
    }
    public void scanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("True or False :");
        this.setGender(Boolean.parseBoolean(input.nextLine()));
        System.out.println("Enter Name :");
        this.setName(input.nextLine());
        System.out.println("Enter Age :");
        this.setAge(Integer.parseInt(input.nextLine()));
        System.out.println("Enter Address :");
        this.setAddress(input.nextLine());
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        Student student1 =new Student();
        Student student2 = new Student();
        student1.scanner();
        student2.scanner();
        student1.display();
        student2.display();
    }

}
