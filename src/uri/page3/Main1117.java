
import java.io.IOException;
import java.util.Scanner;

public class Main1117 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int qnt = 0;
        double notas, total = 0;

        do {

            notas = read.nextDouble();

            if (notas >= 0 && notas <= 10) {
                qnt++;
                total += notas;

            } else {
                System.out.println("nota invalida");
            }

        } while (qnt != 2);

        System.out.printf("media = %.2f\n", (total / 2));

    }
}
