
import java.io.IOException;
import java.util.Scanner;

public class Main1094 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int nTestes, quantia, rato, sapo, coelho, total;
        double ratos, sapos, coelhos;
        String cobaia;

        rato = 0;
        sapo = 0;
        coelho = 0;
        total = 0;

        nTestes = read.nextInt();

        for (int i = 0; i < nTestes; i++) {

            quantia = read.nextInt();
            cobaia = read.next();

            total += quantia;

            switch (cobaia) {
                case "R":
                    rato += quantia;
                    break;

                case "S":
                    sapo += quantia;
                    break;

                case "C":
                    coelho += quantia;
                    break;
            }
        }

        ratos = (double) rato * 100 / total;
        coelhos = (double) coelho * 100 / total;
        sapos = (double) sapo * 100 / total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f", coelhos);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", ratos);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", sapos);
        System.out.println(" %");
    }
}
