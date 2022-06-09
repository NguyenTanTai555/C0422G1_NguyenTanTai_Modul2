package ss3_array_method.array.bai_tap;

import java.util.Scanner;

public class FindMaxOfArray2 {
    public static void main(String[] args) {
        int[][]myArr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.println("Enter element of array children :" + i);
                myArr[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        int max = myArr[0][0];
        for (int a = 0; a < myArr.length ; a++) {
            for (int b = 0; b < myArr[a].length; b++) {
                if (myArr[a][b]>max) {
                    max = myArr[a][b];
                }
            }
        }
        System.out.println("Max is : " + max );
    }
}
