
import java.io.IOException;

public class Main1095 {

    public static void main(String[] args) throws IOException {

        int j = 60;

        for (int i = 1; i < 40; i += 3) {
            System.out.println("I=" + i + " J=" + j);
            j -= 5;
        }
    }
}
