package ss3_array_method.array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int index = Integer.parseInt(scanner.nextLine());
        int[] array = new int[index];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Enter  the element :" + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Initial array :");
        System.out.println(Arrays.toString(array));
    }
}
