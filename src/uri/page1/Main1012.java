package uri.page1;

/*
Escreva um programa que leia 3 valores double A B e C. Mostre:

a) área do triângulo retângulo que tem A por base e C por altura. 
b) área do círculo de raio C. (pi = 3.14159) 
c) área do trapézio que tem A e B por bases e C por altura. 
d) área do quadrado que tem lado B. 
e) área do retângulo que tem lados A e B. 
 */

import java.io.IOException;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Main1012 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        String entrada;
        double A, B, C, pi;
        double tri, cir, tra, qua, ret;

        pi = 3.14159;

        entrada = read.nextLine();
        String valores[] = entrada.split(" ");

        A = Double.parseDouble(valores[0]);
        B = Double.parseDouble(valores[1]);
        C = Double.parseDouble(valores[2]);

        tri = (A * C) / 2;
        cir = pi * pow(C, 2);
        tra = ((A + B) * C) / 2;
        qua = B * B;
        ret = A * B;

        System.out.printf("TRIANGULO: %.3f", tri);
        System.out.printf("\nCIRCULO: %.3f", cir);
        System.out.printf("\nTRAPEZIO: %.3f", tra);
        System.out.printf("\nQUADRADO: %.3f", qua);
        System.out.printf("\nRETANGULO: %.3f", ret);
        System.out.println("");

    }

}
