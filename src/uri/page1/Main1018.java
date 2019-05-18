package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1018 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int N, cedu, cem = 0, cinq = 0, vint = 0, dez = 0, cinc = 0, dois = 0, um = 0;

        N = read.nextInt();
        cedu = N;

        if (N > 0 && N < 1000000) {
            cem = cedu / 100;
            cedu -= (cem * 100);

            cinq = cedu / 50;
            cedu -= (cinq * 50);

            vint = cedu / 20;
            cedu -= (vint * 20);

            dez = cedu / 10;
            cedu -= (dez * 10);

            cinc = cedu / 5;
            cedu -= (cinc * 5);

            dois = cedu / 2;
            cedu -= (dois * 2);

            um = cedu / 1;
            cedu -= um;
        }

        System.out.println(N);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinq + " nota(s) de R$ 50,00");
        System.out.println(vint + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinc + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

    }

}
