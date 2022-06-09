package ss3_array_method.array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndexElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int index = Integer.parseInt(scanner.nextLine());
        String[] myList = new String[index];
        for (int i = 0; i < myList.length; i++) {
            System.out.println("Enter String of Array" + i);
            myList[i] = scanner.nextLine();
        }
            System.out.println(Arrays.toString(myList));
            System.out.println("Enter the String :");
            String a = scanner.nextLine();
            for (int i = 0; i < myList.length; i++) {
                if (a.equals( myList[i])) {
                    System.out.println(i);
                }
        }
    }
}
