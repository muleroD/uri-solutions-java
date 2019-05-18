
import java.io.IOException;
import java.util.Scanner;

public class Main1045 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        float a, b, c, n1, n2, n3;

        a = read.nextFloat();
        b = read.nextFloat();
        c = read.nextFloat();

        n1 = a;
        n2 = b;
        n3 = c;

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                a = n1;
                b = n2;
                c = n3;
            } else {
                a = n1;
                b = n3;
                c = n2;
            }
        } else if (n2 > n3 && n2 > n1) {
            if (n3 > n1) {
                a = n2;
                b = n3;
                c = n1;
            } else {
                a = n2;
                b = n1;
                c = n3;
            }
        } else {
            if (n2 > n1) {
                a = n3;
                b = n2;
                c = n1;
            } else {
                a = n3;
                b = n1;
                c = n2;
            }
        }

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((a * a) == (b * b + c * c)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if ((a * a) > (b * b + c * c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if ((a * a) < (b * b + c * c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && a == c && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || a == c || b == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
