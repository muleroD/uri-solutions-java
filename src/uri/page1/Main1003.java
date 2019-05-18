package uri.page1;

import java.io.IOException;
import java.util.Scanner;

public class Main1003 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int A, B, SOMA;

        A = read.nextInt();
        B = read.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }

}
