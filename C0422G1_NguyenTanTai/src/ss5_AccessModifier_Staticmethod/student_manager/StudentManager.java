package ss5_AccessModifier_Staticmethod.student_manager;

import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[10];

    static {
        students[0] = new Student(1,"A","DN",true,"abc");
        students[1] = new Student(2, "Tai", "DN", true, "tai.dn");
        students[2] = new Student(3, "Tai", "DN", true, "tai.dn");
        students[3] = new Student(4, "Tai", "DN", true, "tai.dn");
        students[4] = new Student(5, "Tai", "DN", true, "tai.dn");
    }

    public void display() {
        for (Student a : students) {
            if (a != null) {
                System.out.println(a);
            } else {
                break;
            }
        }
    }

    public void add() {
        System.out.println("Enter ID :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name :");
        String name = scanner.nextLine();
        System.out.println("Enter Address :");
        String address = scanner.nextLine();
        System.out.println("Enter Gender :");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter Email :");
        String email = scanner.nextLine();
        Student student = new Student(id, name, address, gender, email);
        for (int i = 0; i < students.length; i++) {

            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
        display();

    }

    public void delete() {
        System.out.println("Enter element want delete :");
        int index = Integer.parseInt(scanner.nextLine());
        if (students[index] == null) {
            System.out.println("No student :" + index);
        } else {
            students[index] = null;
            for (int i = 0; i < students.length; i++) {
                students[i] = students[i + 1];
                if (students[i] == null) {
                    break;
                }
            }
        }
        display();
    }
    public void change(){
        System.out.println("Enter element want change :");
        int input = Integer.parseInt(scanner.nextLine());

    }
}
