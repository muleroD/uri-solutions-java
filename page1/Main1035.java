package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1035 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int A, B, C, D;

        A = read.nextInt();
        B = read.nextInt();
        C = read.nextInt();
        D = read.nextInt();

        if (B > C && D > A && (C + D) > (A + B) && C >= 0 && D >= 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }

}
