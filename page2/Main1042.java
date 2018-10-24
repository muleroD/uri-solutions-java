
import java.io.IOException;
import java.util.Scanner;

public class Main1042 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int n1, n2, n3;

        n1 = read.nextInt();
        n2 = read.nextInt();
        n3 = read.nextInt();

        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n1 + "\n" + n2 + "\n" + n3);
            } else {
                System.out.println(n1 + "\n" + n3 + "\n" + n2);
            }
        } else if (n2 < n3 && n2 < n1) {
            if (n3 < n1) {
                System.out.println(n2 + "\n" + n3 + "\n" + n1);
            } else {
                System.out.println(n2 + "\n" + n1 + "\n" + n3);
            }
        } else {
            if (n2 < n1) {
                System.out.println(n3 + "\n" + n2 + "\n" + n1);
            } else {
                System.out.println(n3 + "\n" + n1 + "\n" + n2);
            }
        }

        System.out.println("\n" + n1 + "\n" + n2 + "\n" + n3);
    }

}
