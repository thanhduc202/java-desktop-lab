
import java.util.ArrayList;
import java.util.Scanner;

public class Manage {

    ArrayList<Doctor> list = new ArrayList<>();

    public Manage() {
    }

    Scanner sc = new Scanner(System.in);

    public void addDoctor() {
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        while (code.isEmpty()) {
            System.out.println("Code not null!");
            System.out.print("Enter Code: ");
            code = sc.nextLine();
        }
        if (checkCodeExist(list, code)) {
            System.out.println("Doctor have existed!");
            System.out.println("-------------------");
            return;
        }
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();
        System.out.print("Enter Availability: ");
        int availability = 0;
        while (true) {
            try {
                availability = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Only Number");
                System.out.print("Enter agian: ");
            }
        }

        list.add(new Doctor(code, name, specialization, availability));
        System.out.println("Add succesfull!!!");
    }

    public void updateDoctor() {
        System.out.print("Enter code: ");
        String code = sc.nextLine();
        if (!checkCodeExist(list, code)) {
            System.out.println("Doctor don't have exist");
            System.out.println("------------------------");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter Specialization: ");
                String specialization = sc.nextLine();
                System.out.print("Enter Availability: ");
                int availability = Integer.parseInt(sc.nextLine());
                list.get(i).setName(name);
                list.get(i).setSpecialization(specialization);
                list.get(i).setAvailability(availability);
                System.out.println("Successfull!!");
                break;
            }
        }
    }

    public void deleteDoctor() {
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        if (!checkCodeExist(list, code)) {
            System.out.println("Doctor don't have exist");
            System.out.println("------------------------");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                list.remove(i);
                System.out.println("Deleted!!!");
                System.out.println("------------------------");
                break;
            }
        }

    }

    public void searchDoctor() {
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        if (checkCodeExist(list, text) == false) {
            System.out.println("Doctor don't have exist!");
            System.out.println("------------------------");
            return;
        }
        for (Doctor doctor : list) {
            if (doctor.getCode().equals(text)) {
                System.out.printf("%-10s%-10s%-20s%-20s\n", "Code", "Name", "specialization", "availability");
                System.out.printf("%-10s%-10s%-20s%-20s\n", doctor.getCode(), doctor.name, doctor.specialization, doctor.availability);

            }
        }
    }

    public void display() {
        for (Doctor doctor : list) {
            System.out.printf("%-10s%-10s%-20s%-20s\n", doctor.getCode(), doctor.name, doctor.specialization, doctor.availability);
        }
        if (list.isEmpty()) {
            System.out.println("Don't have doctor");
            System.out.println("------------------------");
        }
    }

    public static boolean checkCodeExist(ArrayList<Doctor> list, String code) {
        for (Doctor doctor : list) {
            if (code.equals(doctor.getCode())) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkName(ArrayList<Doctor> list, String name) {
        for (Doctor doctor : list) {
            if (name.equals(doctor.getName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSpec(ArrayList<Doctor> list, String specialization) {
        for (Doctor doctor : list) {
            if (doctor.getSpecialization().contains(specialization)) {
                return true;
            }
        }
        return false;
    }

    public void chosseOption() {
        int choice = 0;
        do {
            System.out.println("1. Search by Code.");
            System.out.println("2. Search by Name.");
            System.out.println("3. Search by specialization.");
            System.out.println("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter code: ");
                    String code = sc.nextLine();
                    if (checkCodeExist(list, code) == false) {
                        System.out.println("Doctor don't have exist!");
                        System.out.println("------------------------");
                        return;
                    }
                    for (Doctor doctor : list) {
                        if (doctor.getCode().equals(code)) {
                            System.out.printf("%-10s%-10s%-20s%-20s\n", "Code", "Name", "specialization", "availability");
                            System.out.printf("%-10s%-10s%-20s%-20s\n", doctor.getCode(), doctor.name, doctor.specialization, doctor.availability);

                        }
                    }
                    return;
                case 2:
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    if (checkName(list, name) == false) {
                        System.out.println("Doctor don't have exist!");
                        System.out.println("------------------------");
                        return;
                    }
                    for (Doctor doctor : list) {
                        if (doctor.getName().equals(name)) {
                            System.out.printf("%-10s%-10s%-20s%-20s\n", "Code", "Name", "specialization", "availability");
                            System.out.printf("%-10s%-10s%-20s%-20s\n", doctor.getCode(), doctor.name, doctor.specialization, doctor.availability);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter specialization: ");
                    String specialization = sc.nextLine();
                    if (checkSpec(list, specialization) == false) {
                        System.out.println("Doctor don't have exist!");
                        System.out.println("------------------------");
                        return;
                    }
                    System.out.printf("%-10s%-10s%-20s%-20s\n", "Code", "Name", "specialization", "availability");
                    for (Doctor doctor : list) {
                        if (doctor.getSpecialization().contains(specialization)) {
                            System.out.printf("%-10s%-10s%-20s%-20s\n", doctor.getCode(), doctor.name, doctor.specialization, doctor.availability);

                        }
                    }
                    return;

            }

        } while (choice >= 0 && choice <= 3);
    }

}
