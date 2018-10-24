package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1036 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double a, b, c, delta, r1, r2;

        a = read.nextDouble();
        b = read.nextDouble();
        c = read.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        r1 = (-b + Math.sqrt(delta)) / (2 * a);
        r2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (Double.isNaN(r1) || Double.isNaN(r2)
                || Double.isInfinite(r1) || Double.isInfinite(r2)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f", r1);
            System.out.printf("\nR2 = %.5f", r2);
            System.out.println("");
        }
    }
}
