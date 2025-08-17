package CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert an operation in the following scheme: *value* *present currency code* to *desired currency*");

        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        operation = operation.trim();
        new Converter(operation);
    }
}
