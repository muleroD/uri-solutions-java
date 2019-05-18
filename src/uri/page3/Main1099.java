
import java.io.IOException;
import java.util.Scanner;

public class Main1099 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n, x, y, aux = 0;

        n = read.nextInt();

        int soma[] = new int[n];

        for (int i = 0; i < n; i++) {
            x = read.nextInt();
            y = read.nextInt();

            if (x > y) {
                aux = x;
                x = y;
                y = aux;
            }

            for (int j = x + 1; j < y; j++) {
                if (j % 2 != 0) {
                    soma[i] += j;
                }
            }
        }

        for (int i : soma) {
            System.out.println(i);
        }
    }
}
