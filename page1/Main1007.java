package uri.page1;

import java.io.IOException;
import java.util.Scanner;

/*Leia quatro valores inteiros A, B, C e D. A seguir, 
calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
public class Main1007 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        A = read.nextInt();
        B = read.nextInt();
        C = read.nextInt();
        D = read.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }

}
