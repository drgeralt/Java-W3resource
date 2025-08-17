package SimpleCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert the operation followed by the numbers to be calculated (all separated by commas): ");

        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        Calculator calculator = new Calculator();
        System.out.printf("The result is: %.2f",calculator.calculate(operation));
    }
}
