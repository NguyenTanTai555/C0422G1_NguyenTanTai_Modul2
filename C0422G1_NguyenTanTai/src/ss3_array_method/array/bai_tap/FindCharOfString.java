package ss3_array_method.array.bai_tap;

import java.util.Scanner;

public class FindCharOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.println("Enter String :");
        str = scanner.nextLine();
        System.out.println("Enter char want find :");
        char a = scanner.nextLine().charAt(0);
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                flag = false;
                count++;
            }
        }
        if (flag) {
            System.out.println("Have not this char !!!!!!!!!!!");
        } else {
            System.out.println(count);
        }
    }
}
