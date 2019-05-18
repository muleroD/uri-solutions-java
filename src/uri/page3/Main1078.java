package uri.page3;


import java.io.IOException;
import java.util.Scanner;

public class Main1078 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n;
        n = read.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + n * i);
        }

    }
}
