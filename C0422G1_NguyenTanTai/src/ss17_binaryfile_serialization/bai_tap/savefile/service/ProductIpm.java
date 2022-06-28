package ss17_binaryfile_serialization.bai_tap.service;

import ss17_binaryfile_serialization.bai_tap.util.ReadFileCSV;
import ss17_binaryfile_serialization.bai_tap.util.WriteFileCSV;
import ss17_binaryfile_serialization.bai_tap.model.Product;
import java.util.List;
import java.util.Scanner;

public class ProductIpm {
    private static Scanner scanner = new Scanner(System.in);
    public static void add() {
        List<Product> products = ReadFileCSV.readFile();
        System.out.println("Thêm mã sản phẩm  ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Thêm Tên sản phẩm ");
        String tenSp = scanner.nextLine();
        System.out.println("Thêm Hãng sản xuất");
        String hangSx = scanner.nextLine();
        System.out.println("Thêm giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, tenSp, hangSx, price);
        products.add(product);
        WriteFileCSV.writeFile(products);
    }

    public static void display() {
        List<Product> products = ReadFileCSV.readFile();
        if (products.isEmpty()){
            System.err.println("Danh sách rỗng");
            System.out.println("Vui long Thêm sản phẩm !!!");
        }
        for (Product p: products) {
            System.out.println(p);
        }
    }

    public static void search() {
        List<Product> products = ReadFileCSV.readFile();
        int idSearch = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getMaSp() == idSearch) {
                System.out.println(products.get(i));
            }
        }

    }
    public static void remove(){
        List<Product> products = ReadFileCSV.readFile();
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getMaSp() == idRemove){
                products.remove(i);
            }
        }
        WriteFileCSV.writeFile(products);
    }
}
