package ss14_sort.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size arr : ");
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        System.out.println("Enter" + arr.length + "value :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
//    1,2,67,12,4,-1,54,

    public static void selectionSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int indexMin = i ;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[indexMin] > arr[j]){
                    indexMin = j ;
                }
            }
            if (indexMin!= i){
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
    }
}


