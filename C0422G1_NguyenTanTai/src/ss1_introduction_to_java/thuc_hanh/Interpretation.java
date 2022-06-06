package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Interpretation {
    public static void main(String[] args) {
        double weight;// kg;
        double height;// m;
        double bmi;
        Scanner myBmi = new Scanner(System.in);
        System.out.println("Enter weight :");
        weight = Double.parseDouble(myBmi.nextLine());
        System.out.println("Enter height");
        height = Double.parseDouble(myBmi.nextLine());
        bmi = weight / (height * height);
        if (bmi <= 18.5) {
            System.out.println( bmi + " Interpretation : Underweight ");
        } else if (bmi <= 25.0) {
            System.out.println( bmi + " Normal ");
        } else if (bmi <= 30.0) {
            System.out.println( bmi + " OverWeight ");
        } else {
            System.out.println( bmi + " Obese ");
        }
    }
}
