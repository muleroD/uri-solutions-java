
import java.io.IOException;
import java.util.Scanner;

public class Main1073 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n;

        n = read.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + i * i);
            }
        }

    }

}
