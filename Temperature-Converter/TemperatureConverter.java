import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double temperature, result;

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion type: ");

        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = sc.nextDouble();

            result = (temperature * 9 / 5) + 32;
            System.out.println("Result: " + result + " °F");

        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = sc.nextDouble();

            result = (temperature - 32) * 5 / 9;
            System.out.println("Result: " + result + " °C");

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
