package com.josuenenve.bhaskara;

public class Bhaskara {
	
	// Atributos
	private int A;
	private int B;
	private int C;
	private int delta;
	private int x1;
	private int x2;
	
	// Construtor
	public Bhaskara(int valorA, int valorB, int valorC) {
		this.A = valorA;
		this.B = valorB;
		this.C = valorC;
		this.calcDelta();
	}
	
	// Metodos
	private void calcDelta() {
		this.delta = (this.B * this.B) - 4 * this.A * this.C;
		this.calcX();
	}
	
	private void calcX() {
		this.x1 = (-this.B + (this.delta ^ (1/2))) / (2 * this.A);
			System.out.printf("valor do x1 = %d", this.x1);
		this.x2 = (-this.B - (this.delta ^ (1/2))) / (2 * this.A);
			System.out.println("");
			System.out.printf("valor do x2 = %d", this.x2);
			System.out.println("");
	}
	
	public void classificacao() {
		if (this.delta < 0) {
			 System.out.println("a equação do segundo grau não possui raízes reais");
		} else if (this.delta == 0) {
			System.out.println("a equação do segundo grau possui uma raiz real");
		} else if (this.delta > 0) {
			System.out.println("a equação do segundo grau possui duas raízes reais");
		}
	}
	
}
