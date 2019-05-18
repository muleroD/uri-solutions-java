
import java.io.IOException;
import java.util.Scanner;

public class Main1074 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n, x, pos = 0, neg = 0, par = 0, imp = 0;
        String valor = "";

        x = read.nextInt();

        for (int i = 0; i < x; i++) {
            n = read.nextInt();

            if (n == 0) {
                valor += "NULL";
            }

            if (n % 2 == 0 && n != 0) {
                valor += "EVEN ";
            }

            if (n % 2 != 0) {
                valor += "ODD ";
            }

            if (n > 0) {
                valor += "POSITIVE";
            }

            if (n < 0) {
                valor += "NEGATIVE";
            }

            valor += "\n";
        }

        System.out.print(valor);
    }
}
