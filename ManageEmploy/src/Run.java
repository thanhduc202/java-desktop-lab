
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
public class Run {

    public static void main(String[] args) {
        ManageEm m = new ManageEm();
        Scanner sc = new Scanner(System.in);
        m.list.add(new Employee("E1", "Nguyen", "Duc", "Thanh", "0357738777", "thanh@gmail.com", "Bac Ninh", "17/10/2002", "Male", 20000));
        m.list.add(new Employee("E2", "Nguyen", "Duc", "Ha", "0357738486", "thanh@gmail.com", "Ha Noi", "17/10/2002", "Male", 40000));
        m.list.add(new Employee("E3", "Nguyen", "Hao", "Thoa", "0357773886", "thanh@gmail.com", "Lao Cai", "17/10/2002", "Male", 10000));
        
        int choice = 0;
        do {
            System.out.println("1. add");
            System.out.println("2. display");
            System.out.println("3. remove");
            System.out.println("4. Search");
            System.out.println("5. Sort By Salary");
            System.out.println("Your Choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    m.addEmployee();
                    break;
                case 2:
                    m.display();
                    break;
                case 3:
                    m.removeEmployee();
                    break;
                case 4:
                    m.searchEmployee();
                    break;
                case 5:
                    m.sortBySalary();
                    break;
                    
            }
        } while (choice >= 0 && choice <= 6);

    }
}
