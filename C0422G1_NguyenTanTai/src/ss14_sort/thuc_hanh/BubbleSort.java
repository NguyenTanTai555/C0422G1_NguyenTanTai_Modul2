package ss14_sort.thuc_hanh;

import java.sql.ClientInfoStatus;

public class BubbleSort {
    static int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length && flag; i++) {
            flag = false;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int change = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = change;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }

}


