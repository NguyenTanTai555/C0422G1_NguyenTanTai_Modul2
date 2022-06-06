package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        float vnd ;
        vnd =23000;
        float usd;
        double money;
        System.out.println("Enter USD :");
        Scanner scanner = new Scanner(System.in);
        usd = Float.parseFloat(scanner.nextLine());
        money = usd * vnd;
        System.out.println("Money is :" + money + " VND ");
    }
}
