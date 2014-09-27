package com.rp.state;

import java.math.BigDecimal;

public class Bandeira1 implements Bandeira {
	
	private static final BigDecimal TAXA_EMBARQUE = new BigDecimal("2.50");
	private static final BigDecimal PRECO_KM = new BigDecimal("0.30");
	private static final BigDecimal PRECO_TEMPO_MINUTOS = new BigDecimal("0.01");

	@Override
	public BigDecimal calcularPrecoFinal(int tempo, int distancia) {
		BigDecimal valorTempo = PRECO_TEMPO_MINUTOS.multiply(new BigDecimal(
				tempo));
		BigDecimal valorDistancia = PRECO_KM
				.multiply(new BigDecimal(distancia));

		BigDecimal valorFinal = valorTempo.add(valorDistancia);

		return TAXA_EMBARQUE.add(valorFinal);
	}
}
