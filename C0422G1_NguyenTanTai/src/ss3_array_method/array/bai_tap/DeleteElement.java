package ss3_array_method.array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element of array index is :" + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Original Array is :");
        System.out.println(Arrays.toString(array));
        System.out.println("Enter element delete is :");
        int x = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                for (int j = i; j <array.length-1 ; j++) {
                    array[j] = array[j+1];
                    array[j + 1] = 0;
                }
                index = i;
                flag = false;
                i--;
            }
        }
        System.out.println(Arrays.toString(array));
        if (flag) {
            System.out.println(x + "Not in array ");
        } else {
            System.out.println("Index of x is : " + index);
        }
    }
}
