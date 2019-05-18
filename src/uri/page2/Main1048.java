
import java.io.IOException;
import java.util.Scanner;

public class Main1048 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double salario, aumento = 0, novo_sal = 0;
        int prc = 0;

        salario = read.nextFloat();

        if (salario >= 0 && salario <= 400.00) {
            prc = 15;
            aumento = salario * 0.15;
            novo_sal = salario + aumento;
        } else if (salario >= 400.01 && salario <= 800.00) {
            prc = 12;
            aumento = salario * 0.12;
            novo_sal = salario + aumento;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            prc = 10;
            aumento = salario * 0.10;
            novo_sal = salario + aumento;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            prc = 7;
            aumento = salario * 0.07;
            novo_sal = salario + aumento;
        } else {
            prc = 4;
            aumento = salario * 0.04;
            novo_sal = salario + aumento;
        }

        System.out.printf("Novo salario: %.2f", novo_sal);
        System.out.printf("\nReajuste ganho: %.2f", aumento);
        System.out.println("\nEm percentual: " + prc + " %");
    }

}
