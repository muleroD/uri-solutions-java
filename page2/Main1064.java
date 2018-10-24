
import java.io.IOException;
import java.util.Scanner;

public class Main1064 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        double num, media = 0;
        int pos = 0;

        for (int i = 0; i < 6; i++) {
            num = read.nextDouble();
            if (num > 0) {
                pos++;
                media += num;
            }
        }

        media /= pos;

        System.out.println(pos + " valores positivos");
        System.out.printf("%.1f", media);
        System.out.println("");

    }

}
