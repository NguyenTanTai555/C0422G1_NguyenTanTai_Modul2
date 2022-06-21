package ss11_tree_map.bai_tap.baitap1;

import java.util.Scanner;

public class ManagerProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Enter Service you want use :" +
                    "\n1. Add Product " +
                    "\n2. Display product " +
                    "\n3. Delete Product " +
                    "\n4. Find Product " +
                    "\n5. Sort :" +
                    "\n6. Exit");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Method.add();
                    break;
                case 2:
                    Method.display();
                    break;
                case 3:
                    System.out.println("Enter id you want delete ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Method.delete(id);
                    break;
                case 4:
                    System.out.println("Enter id you want find :");
                    int num = Integer.parseInt(scanner.nextLine());
                    Method.find(num);
                    break;
                case 5:
                    int i = Integer.parseInt(scanner.nextLine());
                    System.out.println("1.prices increase gradually." +
                            "\n2.prices decrease gradually." +
                            "\nEnter number:");
                    if (i==1)
                        Method.sort();
                    if (i==2)
                        Method.sortDecreasePrice();
                    else {
                        break;
                    }
                    break;
                default:
                    break;

            }
        } while (choose <=6);

    }
}
