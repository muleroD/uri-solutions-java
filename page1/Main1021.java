package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1021 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        float N;
        int moedas;

        int cedula100, cedula50, cedula20, cedula10, cedula5, cedula2;
        int moeda1, moeda50, moeda25, moeda10, moeda05, moeda01;

        //Inicializando cedulas
        cedula100 = 0;
        cedula50 = 0;
        cedula20 = 0;
        cedula10 = 0;
        cedula5 = 0;
        cedula2 = 0;

        //Inicializando moedas
        moeda1 = 0;
        moeda50 = 0;
        moeda25 = 0;
        moeda10 = 0;
        moeda05 = 0;
        moeda01 = 0;

        N = read.nextFloat();
        moedas = (int) (N * 100 % 100);

        if (N >= 0 && N <= 1000000.00) {
            cedula100 = (int) (N / 100);
            N -= (cedula100 * 100);

            cedula50 = (int) (N / 50);
            N -= (cedula50 * 50);

            cedula20 = (int) (N / 20);
            N -= (cedula20 * 20);

            cedula10 = (int) (N / 10);
            N -= (cedula10 * 10);

            cedula5 = (int) (N / 5);
            N -= (cedula5 * 5);

            cedula2 = (int) (N / 2);
            N -= (cedula2 * 2);

            //
            moeda1 = (int) (N / 1);
            N -= moeda1;

            moeda50 = moedas / 50;
            moedas -= moeda50 * 50;

            moeda25 = moedas / 25;
            moedas -= moeda25 * 25;

            moeda10 = moedas / 10;
            moedas -= moeda10 * 10;

            moeda05 = moedas / 5;
            moedas -= moeda05 * 5;

            moeda01 = moedas / 01;
            moedas -= moeda01;

        }

        System.out.println("NOTAS:");
        System.out.println(cedula100 + " nota(s) de R$ 100.00");
        System.out.println(cedula50 + " nota(s) de R$ 50.00");
        System.out.println(cedula20 + " nota(s) de R$ 20.00");
        System.out.println(cedula10 + " nota(s) de R$ 10.00");
        System.out.println(cedula5 + " nota(s) de R$ 5.00");
        System.out.println(cedula2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");

    }

}
