package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1014 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int x;
        float y, consumo;

        x = read.nextInt();
        y = read.nextFloat();

        consumo = x / y;

        System.out.printf("%.3f", consumo);
        System.out.println(" km/l");
    }

}
