
import java.io.IOException;
import java.util.Scanner;

public class Main1133 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int x, y, aux;

        x = read.nextInt();
        y = read.nextInt();

        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        for (int i = x + 1; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }

    }
}
