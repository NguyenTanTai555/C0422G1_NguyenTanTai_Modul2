package ss12_tree_map.bai_tap.baitap1.Controller;

import ss12_tree_map.bai_tap.baitap1.Service.Service;

import java.util.Scanner;

public class ManagerProduct {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Enter Service you want use :" +
                    "\n1. Add Product " +
                    "\n2. Display product " +
                    "\n3. Delete Product " +
                    "\n4. Find Product " +
                    "\n5. Sort :" +
                    "\n6. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Service.add();
                    break;
                case 2:
                    Service.display();
                    break;
                case 3:
                    System.out.println("Enter id you want delete ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Service.delete(id);
                    break;
                case 4:
                    System.out.println("Enter id you want find :");
                    int num = Integer.parseInt(scanner.nextLine());
                    Service.find(num);
                    break;
                case 5:
                    int i = Integer.parseInt(scanner.nextLine());
                    System.out.println("1.prices increase gradually." +
                            "\n2.prices decrease gradually." +
                            "\nEnter number:");
                    if (i == 1)
                        Service.sort();
                    if (i == 2)
                        Service.sortDecreasePrice();
                    else {
                        break;
                    }
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Please re-enter !!!!!!");
            }
        } while (flag);
    }
}

