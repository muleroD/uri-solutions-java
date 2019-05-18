
import java.io.IOException;
import java.util.Scanner;

public class Main1098 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        float b = 1;

        for (double i = 0; i <= 2.1; i += .2) {
            if (i == 0.0) {
                System.out.println("I=0 J=1");
                System.out.println("I=0 J=2");
                System.out.println("I=0 J=3");
            } else if (i == 1.0) {
                System.out.println("I=1 J=2");
                System.out.println("I=1 J=3");
                System.out.println("I=1 J=4");
            } else if (i == 2.0) {
                System.out.println("I=2 J=3");
                System.out.println("I=2 J=4");
                System.out.println("I=2 J=5");
            } else {
                System.out.printf("I=%.1f", i);
                System.out.printf(" J=%.1f\n", b + i);

                System.out.printf("I=%.1f", i);
                System.out.printf(" J=%.1f\n", b + 1 + i);

                System.out.printf("I=%.1f", i);
                System.out.printf(" J=%.1f\n", b + 2 + i);
            }
        }

    }
}
