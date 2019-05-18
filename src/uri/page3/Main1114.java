
import java.io.IOException;
import java.util.Scanner;

public class Main1114 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int senha = 2002, n;

        n = read.nextInt();

        while (n != senha) {
            System.out.println("Senha Invalida");
            n = read.nextInt();
        }

        if (n == senha) {
            System.out.println("Acesso Permitido");
        }
    }
}
