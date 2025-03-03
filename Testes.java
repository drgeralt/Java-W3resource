import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {

        System.out.print("Input three numbers: ");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Perimeter is: " + 2*Math.PI*a);
        System.out.println("Area is: " + Math.PI*Math.pow(a,2));
    }
}
