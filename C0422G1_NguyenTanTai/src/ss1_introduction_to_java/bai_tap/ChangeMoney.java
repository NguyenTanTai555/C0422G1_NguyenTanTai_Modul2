package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd ;
        vnd =23000;
        double usd;
        double money;
        System.out.println("Enter USD :");
        Scanner sc = new Scanner(System.in);
        usd = Double.parseDouble(sc.nextLine());
        money = usd * vnd;
        System.out.println("Money is :" + money + " VND ");
    }
}
