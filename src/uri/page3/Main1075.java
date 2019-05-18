package uri.page3;


import java.io.IOException;
import java.util.Scanner;

public class Main1075 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n;

        n = read.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }

    }
}
