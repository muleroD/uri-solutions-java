
import java.io.IOException;
import java.util.Scanner;

public class Main1072 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n, x, in = 0, out = 0;

        n = read.nextInt();

        for (int i = 0; i < n; i++) {
            x = read.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        
        System.out.println(in + " in");
        System.out.println(out + " out");

    }

}
