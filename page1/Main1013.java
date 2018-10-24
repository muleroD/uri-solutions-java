package uri.page1;

//Faça um programa que leia três valores e apresente o maior dos três 
//valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

import java.io.IOException;
import static java.lang.Math.abs;
import java.util.Scanner;

public class Main1013 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int a, b, c, MaiorAB, MaiorABC;

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();

        MaiorAB = (a + b + abs(a - b)) / 2;

        MaiorABC = (MaiorAB + c + abs(MaiorAB - c)) / 2;

        System.out.println(MaiorABC + " eh o maior");

    }

}
