import java.util.Scanner;

public class Calculator {

    // Method to perform calculations
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }

    // Main method 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        double result = calc.calculate(a, b, operation);
        System.out.println("Result: " + result);
    }
}

