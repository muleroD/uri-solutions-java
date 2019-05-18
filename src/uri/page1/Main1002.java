package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1002 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double area, raio;

        raio = read.nextFloat();
        area = 3.14159 * raio * raio;

        System.out.printf("A=%.4f\n", area);

    }
}
