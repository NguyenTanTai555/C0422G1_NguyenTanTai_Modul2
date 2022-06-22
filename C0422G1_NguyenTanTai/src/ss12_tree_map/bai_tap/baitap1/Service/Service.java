package ss12_tree_map.bai_tap.baitap1.Service;
import ss12_tree_map.bai_tap.baitap1.util.DecreasePrice;
import ss12_tree_map.bai_tap.baitap1.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Service {
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Cake", 25.0));
        products.add(new Product(2, "Candy", 5.0));
        products.add(new Product(3, "Noddle", 15.0));
    }

    public static void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Id Of Product :");
        int id = Integer.parseInt(in.nextLine());
        System.out.println("Enter Name Of Product :");
        String name = in.nextLine();
        System.out.println("Enter Price Of Product :");
        double price = Double.parseDouble(in.nextLine());
        products.add(new Product(id, name, price));
        display();
    }

    public static void delete(int id) {
        boolean flag = true ;

        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                products.remove(products.get(i));
                flag = false ;

            }
        }if (flag){
            System.out.println("ID does not exist ");
        }
    }
    public static void find(int id){
        for (int i = 0; i <products.size() ; i++) {
            if (id == products.get(i).getId()){
                System.out.println(products.get(i));
            }
        }

    }
    public static void display(){
        for (Product s: products ) {
            System.out.println(s);
        }
    }
    public static void edit(int id){
        for (Product s: products) {
            if(id == s.getId()){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Id");
                int id1 = Integer.parseInt(input.nextLine());
                System.out.println("Enter Name :");
                String name = input.nextLine();
                System.out.println("Enter price");
                double price = Double.parseDouble(input.nextLine());
                s.setId(id1);
                s.setName(name);
                s.setPrice(price);
            }
            
        }
    }
    public static void sort(){
        Collections.sort(products);
        display();
    }
    public static void sortDecreasePrice(){
        DecreasePrice decreasePrice = new DecreasePrice();
        Collections.sort(products,decreasePrice);
        display();
    }
}
