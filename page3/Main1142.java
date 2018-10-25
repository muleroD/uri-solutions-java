
import java.io.IOException;
import java.util.Scanner;

public class Main1142 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n;

        n = read.nextInt();

        for (int j = 1; j <= n * 4; j++) {
            if (j % 4 == 0) {
                System.out.println("PUM");
            } else {
                System.out.print(j + " ");
            }
        }

    }
}
