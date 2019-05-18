
import java.io.IOException;
import java.util.Scanner;

public class Main1061 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        String str;
        int diaIn, horaIn, minIn, segIn;
        int diaOut, horaOut, minOut, segOut;
        int dia, hora, min, seg;

        //Inicio do Jogo
        str = read.next();
        diaIn = read.nextInt();
        horaIn = read.nextInt();
        str = read.next();
        minIn = read.nextInt();
        str = read.next();
        segIn = read.nextInt();

        //Fim do Jogo
        str = read.next();
        diaOut = read.nextInt();
        horaOut = read.nextInt();
        str = read.next();
        minOut = read.nextInt();
        str = read.next();
        segOut = read.nextInt();

        //Calculos
        dia = diaOut - diaIn;
        hora = horaOut - horaIn;
        min = minOut - minIn;
        seg = segOut - segIn;

        while (hora <= 0 || min <= 0 || seg <= 0) {
            if (hora <= 0) {
                dia--;
                hora += 24;
            } else if (min <= 0) {
                hora--;
                min += 60;
            } else if (seg <= 0) {
                hora--;
                min += 59;
                seg += 60;
            }
        }

        while (hora > 23 || min > 59 || seg > 59) {
            if (hora > 23) {
                dia++;
                hora -= 24;
            } else if (min > 59) {
                hora++;
                min -= 60;
            } else if (seg > 59) {
                min++;
                seg -= 60;
            }
        }

        //Exibir
        System.out.println(dia + " dia(s)");
        System.out.println(hora + " hora(s)");
        System.out.println(min + " minuto(s)");
        System.out.println(seg + " segundo(s)");

    }
}
