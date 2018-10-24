package uri.page1;


//Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
import java.io.IOException;
import java.util.Scanner;

public class Main1020 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int idade, dia, mes, ano;

        idade = read.nextInt();

        ano = idade / 365;
        mes = (idade - ano * 365) / 30;
        dia = idade - ano * 365 - mes * 30;

        System.out.println(ano + " ano(s)"
                + "\n" + mes + " mes(es)"
                + "\n" + dia + " dia(s)");

    }

}
