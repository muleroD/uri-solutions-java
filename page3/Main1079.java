package uri.page3;


import java.io.IOException;
import java.util.Scanner;

public class Main1079 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n;
        double testes[] = new double[3];

        n = read.nextInt();
        double result[] = new double[n];

        // 2 - 3 - 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                testes[j] = read.nextDouble();
            }
            result[i] = (testes[0] * 2 + testes[1] * 3 + testes[2] * 5) / 10;
        }

        for (double d : result) {
            System.out.printf("%.1f\n", d);
        }
    }
}
