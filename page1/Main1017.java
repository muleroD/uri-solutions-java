package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1017 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int tempo, velMedia;
        float litros = 12;

        tempo = read.nextInt();
        velMedia = read.nextInt();

        litros = tempo * velMedia;
        litros /= 12;

        System.out.printf("%.3f", litros);
        System.out.println("");

    }

}
