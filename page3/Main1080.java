
import java.io.IOException;
import java.util.Scanner;

public class Main1080 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int maior = 0, posi = 0, num;

        for (int i = 1; i <= 100; i++) {
            num = read.nextInt();
            if (num > maior) {
                maior = num;
                posi = i;
            }
        }

        System.out.println(maior);
        System.out.println(posi);

    }
}
