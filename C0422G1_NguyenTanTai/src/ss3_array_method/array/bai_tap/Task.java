package ss3_array_method.array.bai_tap;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter father length:");
        int m = scanner.nextInt();
        System.out.println("enter children length:");
        int n = scanner.nextInt();
        array2d(m, n);
    }
    public static int[][] array2d (int m, int n){
        Scanner input = new Scanner(System.in);
        int[][] array2D = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter element " + i + " " + j);
                array2D[i][j] = input.nextInt();
            }
        }
        return array2D;
    }
}
