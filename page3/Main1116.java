
import java.io.IOException;
import java.util.Scanner;

public class Main1116 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n, x, y;

        n = read.nextInt();

        for (int i = 0; i < n; i++) {
            x = read.nextInt();
            y = read.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f\n", (float) x / y);
            }

        }

    }
}
