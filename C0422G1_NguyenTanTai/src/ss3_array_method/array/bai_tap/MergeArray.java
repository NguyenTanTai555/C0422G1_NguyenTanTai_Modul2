package ss3_array_method.array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr.length+arr2.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element of arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Arr is :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter element off arr2 :");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Arr2 is :");
        System.out.println(Arrays.toString(arr2));
        for (int j = 0; j < arr.length; j++) {
            arr3[j] = arr[j];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr.length + j] = arr2[j];
        }

    }
}
