package com.rp.state.exercicio;

public class Concluida implements Estado {

	@Override
	public Estado proximoEstado() {
		return new Faturada();
	}

	@Override
	public String toString() {
		return "Concluida";
	}
}
