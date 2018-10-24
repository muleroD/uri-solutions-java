package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1006 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double A, B, C, MEDIA;

        A = read.nextDouble();
        B = read.nextDouble();
        C = read.nextDouble();

        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f", MEDIA);
        System.out.println("");

    }

}
