
import java.util.Scanner;

public class Manage {

    static Scanner sc = new Scanner(System.in);

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputOperator() {
        while (true) {
            String result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.out.println("Please input(+, -, *, /, ^)");
            }
            System.out.println("Enter again: ");
        }
    }

    public static double inputNumber() {
        System.out.println("Enter number: ");
        double number = checkInputDouble();
        return number;
    }

    public static void nomalCalculator() {
        double memory;
        System.out.println("Enter number: ");
        memory = checkInputDouble();
        while (true) {
            System.out.println("Enter operator: ");
            String operator = checkInputOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("/")) {
                memory /= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }
    }

    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

    public static void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        double weight = checkInputDouble();
        System.out.print("Enter Height(cm): ");
        double height = checkInputDouble();
        double bmi = weight*10000 / (height * height);  
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }

}
