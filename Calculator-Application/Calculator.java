import java.util.Scanner;

public class Calculator {

    // Method for Addition
    static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division
    static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;

        do {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                try {
                    switch (choice) {
                        case 1:
                            System.out.println("Result: " + add(num1, num2));
                            break;
                        case 2:
                            System.out.println("Result: " + subtract(num1, num2));
                            break;
                        case 3:
                            System.out.println("Result: " + multiply(num1, num2));
                            break;
                        case 4:
                            System.out.println("Result: " + divide(num1, num2));
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        System.out.println("Calculator exited successfully.");
        sc.close();
    }
}
