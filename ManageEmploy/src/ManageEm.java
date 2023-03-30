
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thanh
 */
public class ManageEm {

    ArrayList<Employee> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("------Add Employee");
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        while (id.isEmpty()) {
            System.out.println("ID not null!!");
            System.out.print("Enter id again: ");
            id = sc.nextLine();
        }
        if (checkIdExist(id)) {
            System.out.println("Employee have existed!!");
            addEmployee();
        }
        System.out.print("Enter fisrt name: ");
        String fn = sc.nextLine();
        if (fn.isEmpty()) {
            System.out.println("First name not null");
            System.out.print("Enter first name again: ");
            fn = sc.nextLine();
        }
        System.out.print("Enter last name: ");
        String ln = sc.nextLine();
        if (ln.isEmpty()) {
            System.out.println("Last name not null");
            System.out.print("Enter last name again: ");
            ln = sc.nextLine();
        }
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        if (phone.isEmpty()) {
            System.out.println("Phone not null!!");
            System.out.print("Enter phone again: ");
            phone = sc.nextLine();
        }
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        if (email.isEmpty()) {
            System.out.println("email not null!!");
            System.out.print("Enter email again: ");
            email = sc.nextLine();
        }
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        if (address.isEmpty()) {
            System.out.println("address not null!!");
            System.out.print("Enter address again: ");
            phone = sc.nextLine();
        }
        System.out.print("Enter DOB: ");
        String dob = "17/10/2002";
        if (dob.isEmpty()) {
            System.out.println("dob not null!!");
            System.out.print("Enter dob again: ");
            dob = sc.nextLine();
        }

    }

    public void removeEmployee() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        if (!checkIdExist(id)) {
            System.out.println("Employee don't have exist!!");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (id.equalsIgnoreCase(list.get(i).getId())) {
                list.remove(i);
                System.out.println("Remove successfull!!");
            }
        }
    }

    public void searchEmployee() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        if (!checkIdExist(id)) {
            System.out.println("Employee dont have exist!!");
            return;
        }
        for (Employee employee : list) {
            if (employee.getId().equalsIgnoreCase(id)) {
                display();
            }
        }
    }

    public void sortBySalary() {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() < o2.getSalary() ? -1 : 1;
            }

        });
        display();
    }

    public void display() {
        System.out.printf("%-5s%-10s%-10s%-10s%-15s%-20s%-10s%-15s%-10s%-1s", "ID", "firstName",
                "lastName",
                "name",
                "Phone",
                "email",
                "address",
                "dob",
                "sex",
                "salary");
        for (Employee employee : list) {
            System.out.println();
            System.out.printf("%-5s%-10s%-10s%-10s%-15s%-20s%-10s%-15s%-10s%-1s",
                    employee.getId(),
                    employee.getFirstName(),
                    employee.getLastName(),
                    employee.getName(),
                    employee.getPhone(),
                    employee.getEmail(),
                    employee.getAddress(),
                    employee.getDob(),
                    employee.getSex(),
                    employee.getSalary());
            
        }
        System.out.println();
    }

    public boolean checkIdExist(String id) {
        for (Employee employee : list) {
            if (id.equals(employee.getId())) {
                return true;
            }
        }
        return false;
    }

}
