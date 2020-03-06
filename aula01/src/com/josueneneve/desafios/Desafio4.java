package com.josueneneve.desafios;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		int x;
		int tab;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("TABUADA: ");
		
		x = inp.nextInt();
		
		tab = 0;
		
		for (int i = 1; i <= 10; i++) {
			tab = x * i;
			System.out.println("");
			System.out.printf("%d x %d = %d", x, i, tab);
		}
		
		inp.close();
		
	}

}
