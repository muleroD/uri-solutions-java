
import java.io.IOException;
import java.util.Scanner;

public class Main1043 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        float a, b, c, perimetro, area;

        a = read.nextFloat();
        b = read.nextFloat();
        c = read.nextFloat();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }

}
