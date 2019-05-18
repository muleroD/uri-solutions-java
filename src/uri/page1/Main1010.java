package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1010 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        String linha1, linha2;

        int cod1, cod2;
        int num1, num2;
        double val1, val2;

        double total;

        linha1 = read.nextLine();
        linha2 = read.nextLine();

        String array1[] = linha1.split(" ");
        String array2[] = linha2.split(" ");

        cod1 = Integer.parseInt(array1[0]);
        num1 = Integer.parseInt(array1[1]);
        val1 = Double.parseDouble(array1[2]);

        cod2 = Integer.parseInt(array2[0]);
        num2 = Integer.parseInt(array2[1]);
        val2 = Double.parseDouble(array2[2]);

        total = (num1 * val1) + (num2 * val2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        System.out.println("");
    }

}
