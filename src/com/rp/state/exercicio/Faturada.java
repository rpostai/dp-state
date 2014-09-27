package com.rp.state.exercicio;

public class Faturada implements Estado {

	@Override
	public Estado proximoEstado() {
		return null;
	}

	@Override
	public String toString() {
		return "Faturada []";
	}
}
