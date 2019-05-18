
import java.io.IOException;
import java.util.Scanner;

public class Main1047 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int hI, hF, mI, mF, hD, mD;

        hI = read.nextInt();
        mI = read.nextInt();

        hF = read.nextInt();
        mF = read.nextInt();

        hD = hF - hI;
        mD = mF - mI;

        if (hI == hF && mI == mF) {
            System.out.println("O JOGO DUROU " + 24 + " HORA(S) E " + 0 + " MINUTO(S)");
        } else if (hD == 0 && mD < 0) {
            System.out.println("O JOGO DUROU " + (hD + 23) + " HORA(S) E " + (mD + 60) + " MINUTO(S)");
        } else if (hD > 0 && mD < 0) {
            System.out.println("O JOGO DUROU " + (hD - 1) + " HORA(S) E " + (mD + 60) + " MINUTO(S)");
        } else if (hD < 0 && mD == 1) {
            System.out.println("O JOGO DUROU " + (hD + 23) + " HORA(S) E " + (mD - 1) + " MINUTO(S)");
        } else if (hD < 0 && mD < 0) {
            System.out.println("O JOGO DUROU " + (hD + 23) + " HORA(S) E " + (mD + 60) + " MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + (hD) + " HORA(S) E " + (mD) + " MINUTO(S)");
        }

    }

}
