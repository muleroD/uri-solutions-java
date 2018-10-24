package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1008 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int numFunc, numHora;
        double vlHora, sal;

        numFunc = read.nextInt();
        numHora = read.nextInt();
        vlHora = read.nextDouble();

        sal = (vlHora * numHora);

        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f", sal);
        System.out.println("");

    }
}
