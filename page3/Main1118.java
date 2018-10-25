
import java.io.IOException;
import java.util.Scanner;

public class Main1118 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int novo = 1, qnt;
        double notas, total;

        while (novo != 2) {

            qnt = 0;
            total = 0;

            if (novo == 1) {

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

            System.out.println("novo calculo (1-sim 2-nao)");
            novo = read.nextInt();

        }
    }
}
