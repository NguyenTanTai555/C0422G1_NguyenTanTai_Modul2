package until;

import model.Customer;
import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    public static List<String> reader(String path){
        List<String> list = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writer(List<String> list,String path ,boolean append){
        File file = new File(path);
        FileWriter fileWriter = null ;
        try {
            fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Customer> readFileCustomer(String path){
        List<Customer> customers = new ArrayList<>();
        List<String> CustomerList = reader(path);
        String []arr ;
        for (int i = 0; i < CustomerList.size(); i++) {
            arr = CustomerList.get(i).split(",");
            customers.add(new Customer(arr[0],arr[1],arr[2],Boolean.parseBoolean(arr[3]),arr[4],arr[5],arr[6],arr[7],arr[8] ));
        }
        return customers;
    }
    public static void writeFileCustomer(List<Customer> list , String path , boolean append){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer s: list) {
                bufferedWriter.write(s.getInfoToString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Employee> readFileEmployee(String path){
        List<Employee> employees = new ArrayList<>();
        List<String>  EmployeeList = reader(path);
        String [] arr;
        for (int i = 0; i < EmployeeList.size(); i++) {
                arr = EmployeeList.get(i).split(",");
                employees.add(new Employee());
        }
    }

}
