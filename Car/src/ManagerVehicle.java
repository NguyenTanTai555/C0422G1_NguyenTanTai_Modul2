import java.util.ArrayList;
import java.util.Scanner;

public class ManagerVehicle {
    public static void main(String[] args) {
        int check;
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Cars(5555, "MerE200", 1999, "Mercedes", 4, "4 wheel"));
        vehicles.add(new MotoCycle(7777, "Dream", 1995, "Honda", 110));
        vehicles.add(new Truck(9999, "Hyundai", 1995, "Hyundai", 110));
        do {
            System.out.println("Vehicle management program :" + "\n"
                    + "1.ADD new vehicle :" + "\n"
                    + "2.DISPLAY vehicle :" + "\n"
                    + "3.DELETE vehicle :" + "\n"
                    + "4.SEARCH id of vehicle :" + "\n"
                    + "5.EXIT :" + "\n");
            System.out.println("Enter function you want to use :");
            Scanner scanner = new Scanner(System.in);
            check = Integer.parseInt(scanner.nextLine());
            switch (check) {
                case 1:
                    System.out.println("Enter number :");
                    System.out.println("1. ADD NEW CAR" + "\n"
                                        + "2. ADD NEW Truck" + "\n"
                                        + "3. ADD NEW MotoCycle" + "\n");
                    int add = Integer.parseInt(scanner.nextLine());
                    if (add == 1)
                        vehicles.add(new Cars( ));
                    if (add == 2)
                        vehicles.add(new Truck());
                    if (add == 3)
                        vehicles.add(new MotoCycle());
                    break;
                case 2:
                    for (Vehicle s : vehicles) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.println("Enter element want delete :" + "\n");
                    int remove = Integer.parseInt(scanner.nextLine());
                    vehicles.remove(remove);
                    break;
                case 4:
                    System.out.println("Enter id you want search");
                    int id = Integer.parseInt(scanner.nextLine());
                    boolean flag = true ;
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle.getId() == id) {
                            System.out.println(vehicle);
                            flag = false;
                        }
                    }
                    if (flag)
                    System.out.println("Id your enter do not exist , Please re-enter");
                    break;
                case 5:
                    System.out.println("See your late");
                    break;

            }
            System.out.println();

        } while (check <= 5);

    }
}
