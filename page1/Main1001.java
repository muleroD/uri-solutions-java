/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri.page1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mulero
 */
public class Main1001 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int A, B, X;

        A = read.nextInt();
        B = read.nextInt();

        X = A + B;

        System.out.println("X = " + X);

    }
}
