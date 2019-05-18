
import java.io.IOException;
import java.util.Scanner;

public class Main1044 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int a, b;

        a = read.nextInt();
        b = read.nextInt();

        if (a > b) {
            if (a % b == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else if (b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }

}
