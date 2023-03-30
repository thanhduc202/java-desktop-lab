
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit Calculator");
            System.out.println("Please choose the option: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Manage.nomalCalculator();
                    break;
                case 2:
                    Manage.BMICalculator();
                    break;
                case 3:
                default:
                    System.out.println("Good Bye!!");
                    return;
            }
        } while (choice >= 0 && choice <= 4);
    }
}
