package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1004 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int A, B, PROD;

        A = read.nextInt();
        B = read.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }

}
