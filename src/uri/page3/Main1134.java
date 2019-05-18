
import java.io.IOException;
import java.util.Scanner;

public class Main1134 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int combus;
        int combustivel[] = {0, 0, 0};

        do {
            combus = read.nextInt();

            switch (combus) {
                case 1:
                    combustivel[0]++;
                    break;

                case 2:
                    combustivel[1]++;
                    break;

                case 3:
                    combustivel[2]++;
                    break;

                case 4:
                    break;
            }
        } while (combus != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + combustivel[0]);
        System.out.println("Gasolina: " + combustivel[1]);
        System.out.println("Diesel: " + combustivel[2]);

    }
}   
