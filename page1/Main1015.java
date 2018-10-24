package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1015 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        String linha1, linha2;
        float x1, y1, x2, y2, distancia, xt, yt;

        linha1 = read.nextLine();
        linha2 = read.nextLine();

        String array1[] = linha1.split(" ");
        String array2[] = linha2.split(" ");

        x1 = Float.parseFloat(array1[0]);
        y1 = Float.parseFloat(array1[1]);

        x2 = Float.parseFloat(array2[0]);
        y2 = Float.parseFloat(array2[1]);

        xt = (float) Math.pow(x2 - x1, 2);
        yt = (float) Math.pow(y2 - y1, 2);

        distancia = (float) Math.sqrt(xt + yt);

        System.out.printf("%.4f", distancia);
        System.out.println("");
    }

}
