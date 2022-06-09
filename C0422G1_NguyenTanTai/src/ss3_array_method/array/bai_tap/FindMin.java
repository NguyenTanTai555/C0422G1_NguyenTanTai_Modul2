package ss3_array_method.array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int index = Integer.parseInt(scanner.nextLine());
        int[] myArr = new int[index];
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Enter element of array :" + i);
            myArr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("myArr is :");
        System.out.println(Arrays.toString(myArr));
        int min = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i]<min) {
                min = myArr[i];
            }
        }
        System.out.println("Value min of array is :" + min );


    }
}
