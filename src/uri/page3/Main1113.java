
import java.io.IOException;
import java.util.Scanner;

public class Main1113 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int x, y;

        x = read.nextInt();
        y = read.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
            } else if (y > x) {
                System.out.println("Crescente");
            }

            x = read.nextInt();
            y = read.nextInt();
        }

    }
}
