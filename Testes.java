import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        String str = "+123.4500";
        double d = Double.parseDouble(str); // returns double primitive
        System.out.println(d); //-123.45, trailing 0s are removed
    }
}
