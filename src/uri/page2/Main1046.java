
import java.io.IOException;
import java.util.Scanner;

public class Main1046 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int horaInicio, horaFim;

        horaInicio = read.nextInt();
        horaFim = read.nextInt();

        if (horaFim == horaInicio) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (horaInicio < horaFim) {
            System.out.println("O JOGO DUROU " + (horaFim - horaInicio) + " HORA(S)");
        } else {
            horaFim += 24;
            System.out.println("O JOGO DUROU " + (horaFim - horaInicio) + " HORA(S)");
        }

    }

}
