package ss3_array_method.array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        System.out.println("Enter length of array : ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number];
        for (int i = 0; i < arr.length/2; i++) {
            System.out.println("Enter element of arr index is :" + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter number Adđ : ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter index you want Add :");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                for (int j = arr.length-1; j > i ; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i] = x ;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
