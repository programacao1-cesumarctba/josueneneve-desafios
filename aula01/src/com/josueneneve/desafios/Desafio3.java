package com.josueneneve.desafios;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		int x, f;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		
		x = inp.nextInt();
		
		f = x;
		
		while (x > 1) {
			f = f * (x - 1);
			
			x--;
		}
		
		System.out.printf("fatorial é %d", f);
			
		inp.close();

	}

}
