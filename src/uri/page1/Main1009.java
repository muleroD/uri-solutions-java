package uri.page1;

/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês 
(em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o total a receber no final do mês, com duas casas decimais.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main1009 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        String nome;
        double salFixo, vendas, total;

        nome = read.next();
        salFixo = read.nextDouble();
        vendas = read.nextDouble();

        total = salFixo + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f", total);
        System.out.println("");

    }

}
