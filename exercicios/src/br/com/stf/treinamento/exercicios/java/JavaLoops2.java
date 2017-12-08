package br.com.stf.treinamento.exercicios.java;

import java.util.Scanner;

public final class JavaLoops2 {
	public static void executar() {
		Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for(int i=0; i<t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<=n ;j++ ) {
//            	System.out.print(resultado);
            	System.out.print(" ");
            }
            System.out.println("");
        }
        in.close();
	}
}
