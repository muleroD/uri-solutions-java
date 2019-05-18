package uri.page2;

import java.io.IOException;
import java.util.Scanner;

public class Main1040 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        //peso 2, 3, 4, 1
        float N1, N2, N3, N4, exame, media;

        N1 = read.nextFloat();
        N2 = read.nextFloat();
        N3 = read.nextFloat();
        N4 = read.nextFloat();

        media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;

        if (media >= 7) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media <= 6.9) {
            exame = read.nextFloat();
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", exame);

            media += exame;
            media /= 2;

            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else if (media <= 4.9) {
                System.out.println("Aluno aprovado.");
            }
            System.out.println("Media final: " + media);
        }
    }
}
