package uri.page1;

/*
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 */

import java.io.IOException;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Main1011 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double pi = 3.14159, R, volume;

        R = read.nextDouble();

        volume = (4.0 / 3) * pi * pow(R, 3);

        System.out.printf("VOLUME = %.3f", volume);
        System.out.println("");
    }

}
