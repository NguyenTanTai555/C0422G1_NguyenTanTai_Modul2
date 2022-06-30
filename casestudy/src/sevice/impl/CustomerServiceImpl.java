package sevice;

import model.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerService implements ICustomer {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Customer> customers = new LinkedList<>();

    @Override
    public void add() {
        System.out.println("Enter id :");
        String id = scanner.nextLine();
        System.out.println("Enter name :");
        String name = scanner.nextLine();
        System.out.println("Enter day of birth :");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter gender");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter id Card ");
        String idCard = scanner.nextLine();
        System.out.println("Enter type of guest");
        String tyOfGuest = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dayOfBirth, gender, phoneNumber, email, idCard, tyOfGuest, address);
        customers.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("Enter id you want edit :");
        String id = scanner.nextLine();
        for (Customer e : customers) {
            if (e.getId().equals(id)) ;
            System.out.println("Edit id");
            e.setId(scanner.nextLine());
            System.out.println("Edit name");
            e.setName(scanner.nextLine());
            System.out.println("Edit edit day of birth :");
            e.setDayOfBirth(scanner.nextLine());
            System.out.println("Edit gender :");
            e.setGender(scanner.nextBoolean());
            System.out.println("Edit phone number :");
            e.setPhoneNumber(scanner.nextLine());
            System.out.println("Edit email :");
            e.setEmail(scanner.nextLine());
            System.out.println("Edit id card :");
            e.setIdCard(scanner.nextLine());
            System.out.println("Edit address:");
            e.setAddress(scanner.nextLine());
            System.out.println("Edit type of guest ");
            e.setTypeOfGuest(scanner.nextLine());
            return;

        }
    }

    @Override
    public void delete() {
        System.out.println("Enter id you want delete");
        String id = scanner.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(id)) ;
            customers.remove(i);
        }
        display();
    }

    @Override
    public void display() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
