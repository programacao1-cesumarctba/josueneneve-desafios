package com.josueneneve.desafios;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		x = inp.nextInt();
		
		if (x % 2 == 0) {
			if (x < 10) {
				System.out.println("Não é estranho");
			} else if (x >= 10 && x <= 20) {
				System.out.println("Estranho");
			} else if (x > 20) {
				System.out.println("Não é estranho");
			}
		} else {
			System.out.println("Estranho");
		}
		
		inp.close();
	}

}
