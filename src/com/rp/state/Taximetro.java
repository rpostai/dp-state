package com.rp.state;

import java.math.BigDecimal;

public class Taximetro {

	Bandeira bandeira;

	public Taximetro(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	public BigDecimal exibirPrecoFinal(int tempo, int distancia) {
		return bandeira.calcularPrecoFinal(tempo, distancia);
	}

}
