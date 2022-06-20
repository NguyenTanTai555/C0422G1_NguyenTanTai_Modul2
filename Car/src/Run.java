import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ManagerVehicle managerVehicle = new ManagerVehicle();
        int check ;
        Scanner input = new Scanner(System.in);
        do{
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
                        if (add == 1) {
                            ManagerVehicle.addCar();
                        }
                        if (add == 2) {
                            ManagerVehicle.addTruck();
                        }
                        if (add == 3) {
                            ManagerVehicle.addMoto();
                        }
                        break;
                    case 2:
                        for () {
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
                        boolean flag = true;
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

            } while(check <=5);
        }
    }

