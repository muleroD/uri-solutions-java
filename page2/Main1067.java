package uri.page2;


import java.io.IOException;
import java.util.Scanner;

public class Main1067 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int x;

        x = read.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

}
