
import java.io.IOException;
import java.util.Scanner;

public class Main1065 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int num;
        int pos = 0;

        for (int i = 0; i < 5; i++) {
            num = read.nextInt();
            if (num % 2 == 0) {
                pos++;
            }
        }

        System.out.println(pos + " valores pares");

    }

}
