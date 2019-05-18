
import java.io.IOException;
import java.util.Scanner;

public class Main1143 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n;

        n = read.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
        }

    }
}
