
import java.io.IOException;

public class Main1097 {

    public static void main(String[] args) throws IOException {

        int k = 7;

        for (int i = 1; i < 10; i += 2) {
            for (int j = (k + i) - 1; j >= (k + i) - 3; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}
