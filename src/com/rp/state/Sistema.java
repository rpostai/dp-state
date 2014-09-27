package com.rp.state;

public class Sistema {
	public static void main(String[] args) {
		Bandeira b1 = new Bandeira1();
		Taximetro t = new Taximetro(b1);
		System.out.println("Preco para bandeira 1: " + t.exibirPrecoFinal(10, 5));
		
		Bandeira b2 = new Bandeira2();
		t = new Taximetro(b2);
		System.out.println("Preco para bandeira 2: " + t.exibirPrecoFinal(10, 5));
	}
}
