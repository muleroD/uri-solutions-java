
import java.io.IOException;
import java.util.Scanner;

public class Main1051 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double salario, imposto = 0;

        salario = read.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario <= 4500.00) {
            imposto = (salario - 3000) * 0.18 + 80;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario > 4500.00) {
            imposto = (salario - 4500) * 0.28 + 350;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
