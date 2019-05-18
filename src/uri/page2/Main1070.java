
import java.io.IOException;
import java.util.Scanner;

public class Main1070 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int x, aux = 0;

        x = read.nextInt();

        for (int i = x; i < x * 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                aux++;
            }

            if (aux == 6) {
                break;
            }
        }

    }

}
