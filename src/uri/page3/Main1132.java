
import java.io.IOException;
import java.util.Scanner;

public class Main1132 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int x, y, sum = 0, aux;

        x = read.nextInt();
        y = read.nextInt();

        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}
