
import java.io.IOException;
import java.util.Scanner;

public class Main1101 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int x, y, sum = 0, aux;

        x = read.nextInt();
        y = read.nextInt();

        while (x > 0 && y > 0) {

            if (x > y) {
                aux = x;
                x = y;
                y = aux;
            }

            //soma
            for (int i = x; i <= y; i++) {
                sum += i;
            }

            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + sum);

            x = read.nextInt();
            y = read.nextInt();
            sum = 0;
        }
    }
}
