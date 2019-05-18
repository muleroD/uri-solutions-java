package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1038 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int cod, qnt;
        float valor;

        cod = read.nextInt();
        qnt = read.nextInt();

        switch (cod) {
            case 1:
                valor = (float) (qnt * 4.00);
                System.out.printf("Total: R$ %.2f", valor);
                break;
            case 2:
                valor = (float) (qnt * 4.50);
                System.out.printf("Total: R$ %.2f", valor);
                break;
            case 3:
                valor = (float) (qnt * 5.00);
                System.out.printf("Total: R$ %.2f", valor);
                break;
            case 4:
                valor = (float) (qnt * 2.00);
                System.out.printf("Total: R$ %.2f", valor);
                break;
            case 5:
                valor = (float) (qnt * 1.50);
                System.out.printf("Total: R$ %.2f", valor);
                break;
        }
        System.out.println("");

    }

}
