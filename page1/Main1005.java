package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1005 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double A, B, MEDIA;

        A = read.nextDouble();
        B = read.nextDouble();

        MEDIA = (3.5 * A + 7.5 * B) / 11.0;

        System.out.printf("MEDIA = %.5f", MEDIA);
        System.out.println("");

    }

}
