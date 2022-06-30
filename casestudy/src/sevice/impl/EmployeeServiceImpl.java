package sevice;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService implements IEmployee {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Enter idEmployee :");
        String name = scanner.nextLine();
        System.out.println("Enter idCard :");
        String id = scanner.nextLine();
        System.out.println("Enter day of birth");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter gender :");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter Phone number");
        String phone = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter idCard ");
        String idCard = scanner.nextLine();
        System.out.println("Enter position :");
        String position = scanner.nextLine();
        System.out.println("Enter level");
        String level = scanner.nextLine();
        System.out.println("Enter wage");
        double wage = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, name, dayOfBirth, gender, phone, email, idCard, level, position, wage);
        employees.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Enter id you want edit");
        String id = scanner.nextLine();
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
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
                System.out.println("Edit level :");
                e.setLevel(scanner.nextLine());
                System.out.println("Edit position ");
                e.setPosition(scanner.nextLine());
                System.out.println("Edit wage ");
                e.setWage(Double.parseDouble(scanner.nextLine()));
                return;
            }
        }
    }

    @Override
    public void delete() {
        String id = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)){
                employees.remove(i);
            }
        }
        display();
        }

    @Override
    public void display() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
