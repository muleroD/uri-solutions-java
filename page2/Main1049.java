
import java.io.IOException;
import java.util.Scanner;

public class Main1049 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        String primeiro, segundo, terceiro;

        primeiro = read.next();
        segundo = read.next();
        terceiro = read.next();

        if (primeiro.equals("vertebrado")) {
            if (segundo.equals("ave")) {
                if (terceiro.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else if (terceiro.equals("onivoro")) {
                System.out.println("homem");
            } else {
                System.out.println("vaca");
            }
        } else {
            if (segundo.equals("inseto")) {
                if (terceiro.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (terceiro.equals("onivoro")) {
                    System.out.println("minhoca");
                } else {
                    System.out.println("sanguessuga");
                }
            }
        }

    }

}
