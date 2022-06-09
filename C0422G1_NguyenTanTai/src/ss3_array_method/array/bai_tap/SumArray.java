package ss3_array_method.array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =1 ;
        do {
            System.out.println("Enter length array father:");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter length array sons: ");
            int number2 = Integer.parseInt(scanner.nextLine());
            int[][] myArr = new int[number][number2];
            for (int i = 0; i < myArr.length; i++) {
                for (int j = 0; j < myArr.length; j++) {
                    System.out.println("Enter element of array sons :" + i);
                    myArr[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            System.out.println("Enter col ");
            int sum = 0 , col = Integer.parseInt(scanner.nextLine());
            boolean flag =true;
            for (int i = 0; i < myArr.length; i++) {

                for (int j = 0; j < myArr[i].length; j++) {

                    if (col == j){
                        flag = false;
                        sum += myArr[i][j];
                    }
                }
            } if (flag){
                System.out.println("Not this col!!!!!!!");
            }
            System.out.println("Sum col :" + col + "="+sum );
            count++;
        }while (count<=10);

    }

}
