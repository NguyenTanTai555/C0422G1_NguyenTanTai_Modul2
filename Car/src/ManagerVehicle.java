import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerVehicle {
    public static void main(String[] args) {
        int check;
         ArrayList<Vehicle> vehicles = new ArrayList<>();

         {
            vehicles.add(new Cars(5555, "MerE200", 1999, "Mercedes", 4, "4 wheel"));
            vehicles.add(new MotoCycle(7777, "Dream", 1995, "Honda", 110));
            vehicles.add(new Truck(9999, "Hyundai", 1995, "Hyundai", 110));
        }
    }
    public static Cars addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter year");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter owner");
        String owner = scanner.nextLine();
        System.out.println("Enter number of Seats");
        int seats = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter vehicle Type");
        String type = scanner.nextLine();
        return new Cars(id, name, year, owner, seats, type);
    }

    public static Truck addTruck() {
        Scanner truck = new Scanner(System.in);
        System.out.println("Enter id");
        int id = Integer.parseInt(truck.nextLine());
        System.out.println("Enter Name");
        String name = truck.nextLine();
        System.out.println("Enter year");
        int year = Integer.parseInt(truck.nextLine());
        System.out.println("Enter owner");
        String owner = truck.nextLine();
        System.out.println("Enter GrossTon");
        double grosston = Double.parseDouble(truck.nextLine());
        return new Truck(id, name, year, owner, grosston);
    }

    public static MotoCycle addMoto() {
        Scanner moto = new Scanner(System.in);
        System.out.println("Enter id");
        int id = Integer.parseInt(moto.nextLine());
        System.out.println("Enter Name");
        String name = moto.nextLine();
        System.out.println("Enter year");
        int year = Integer.parseInt(moto.nextLine());
        System.out.println("Enter owner");
        String owner = moto.nextLine();
        System.out.println("Enter wattge");
        int wattge = Integer.parseInt(moto.nextLine());
        return new MotoCycle(id, name, year, owner, wattge);
    }
    public static void display(){
    }
}
