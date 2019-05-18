
import java.io.IOException;
import java.util.Scanner;

public class Main1060 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double num;
        int pos = 0;

        for (int i = 0; i < 6; i++) {
            num = read.nextDouble();
            if (num > 0) {
                pos++;
            }
        }

        System.out.println(pos + " valores positivos");

    }

}
