package com.josueneneve.desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		x = inp.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		inp.close();
	}

}
