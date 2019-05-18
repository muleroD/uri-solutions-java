
import java.io.IOException;
import java.util.Scanner;

public class Main1066 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n, pos = 0, neg = 0, par = 0, imp = 0;

        for (int i = 0; i < 5; i++) {
            n = read.nextInt();

            if (n > 0) {
                pos++;
            }

            if (n < 0) {
                neg++;
            }

            if (n % 2 == 0) {
                par++;
            }

            if (n % 2 != 0) {
                imp++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

    }

}
