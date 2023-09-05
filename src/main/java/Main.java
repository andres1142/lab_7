import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to this calculator!");
        
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Operation followed by number1 and number 2 or type \"done\" to exit: ");
            String operation = scanner.next();
        
            while (!operation.equals("done")) {
                int num1 = scanner.nextInt(); // Read integer for num1
                int num2 = scanner.nextInt(); // Read integer for num2

                Calculator calculator = new Calculator();

                switch (operation) {
                    case "add":
                        System.out.println(calculator.add(num1, num2));
                        break;
                    case "subtract":
                        System.out.println(calculator.subtract(num1, num2));
                        break;
                    case "multiply":
                        System.out.println(calculator.multiply(num1, num2));
                        break;
                    case "divide":
                        System.out.println(calculator.divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid operation");
                        break;
                }
                // Get next operation
                System.out.println("Enter Operation followed by number1 and number 2 or type \"done\" to exit: ");
                operation = scanner.next();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
