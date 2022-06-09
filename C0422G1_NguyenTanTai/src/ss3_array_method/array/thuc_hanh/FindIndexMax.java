package ss3_array_method.array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndexMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int number = Integer.parseInt(scanner.nextLine());
        Double[] money = new Double[number];
        for (int i = 0; i < money.length; i++) {
            System.out.println("Enter money  " + i);
            money[i] = Double.parseDouble(scanner.nextLine());
        }
        System.out.println(Arrays.toString(money));
        int index = 0;
        double max = money[0];
        for (int i = 0; i < money.length; i++) {
            if (max < money[i]) {
                max = money[i];
                index = i;
            }
        } System.out.println("Value max is : " + max + "\n" +"index of max is : " + index );
    }
}


