package com.rp.state;

import java.math.BigDecimal;

public class Bandeira2 implements Bandeira {

	private static final BigDecimal TAXA_EMBARQUE = new BigDecimal("4.50");
	private static final BigDecimal PRECO_KM = new BigDecimal("0.50");
	private static final BigDecimal PRECO_TEMPO_MINUTOS = new BigDecimal("0.3");

	@Override
	public BigDecimal calcularPrecoFinal(int tempo, int distancia) {
		BigDecimal valorTempo = PRECO_TEMPO_MINUTOS.multiply(new BigDecimal(
				tempo));
		BigDecimal valorDistancia = PRECO_KM
				.multiply(new BigDecimal(distancia));
		BigDecimal valorFinal = valorTempo.compareTo(valorDistancia) > 0 ? valorTempo
				: valorDistancia;
		return TAXA_EMBARQUE.add(valorFinal);
	}
}
