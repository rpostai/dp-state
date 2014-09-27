package com.rp.state.exercicio;

public class EmAtendimento implements Estado {

	@Override
	public Estado proximoEstado() {
		return new Concluida();
	}

	@Override
	public String toString() {
		return "EmAtendimento";
	}
	
	

}
