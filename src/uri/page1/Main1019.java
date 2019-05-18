package uri.page1;


import java.io.IOException;
import java.util.Scanner;

public class Main1019 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int N, hora, min, seg;

        N = read.nextInt();

        hora = N / 3600;
        min = (N - hora * 3600) / 60;
        seg = N - (hora * 3600) - (min * 60);

        System.out.println(hora + ":" + min + ":" + seg);
    }

}
