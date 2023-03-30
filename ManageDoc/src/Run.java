
import java.util.ArrayList;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
//        ArrayList<Doctor> list = new ArrayList<>();
        Manage m = new Manage();
        m.list.add(new Doctor("Doc 1", "Nghia", "Orth", 3));
        m.list.add(new Doctor("Doc 2", "Lien", "Orth", 2));
        m.list.add(new Doctor("Doc 3", "Hoa", "Obth", 1));

        Scanner sc = new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("1. Add doctor");
            System.out.println("2. Update doctor");
            System.out.println("3. Delete doctor");
            System.out.println("4. Search doctor");
            System.out.println("5. Exit");
            System.out.println("6. Display");
            System.out.print("Enter your choice: ");
            
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please input Integer!");
            }

            switch (choice) {
                case 1:
                    System.out.println("--------- Add Doctor --------- ");
                    m.addDoctor();
                    break;
                case 2:
                    System.out.println("--------- Update Doctor --------- ");
                    m.updateDoctor();
                    break;
                case 3:
                    System.out.println("--------- Delete Doctor -------");
                    m.deleteDoctor();
                    break;
                case 4:
                    System.out.println("--------- Search Doctor--------- ");
                    m.chosseOption();
                    break;
                case 5:
                    System.out.println("----Result----");
                    System.out.printf("%-10s%-10s%-20s%-20s\n", "Code", "Name", "Specialization", "Availability");
                    m.display();
                    break;
                case 6:
                    m.display();;
                    break;
                    
                case 7:
                    System.out.println("----Good Bye!!----");
                    break;
                default:

            }

        } while (choice <= 7 && choice >= 0);

    }
}
