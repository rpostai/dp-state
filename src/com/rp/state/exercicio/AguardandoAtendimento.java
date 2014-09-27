package com.rp.state.exercicio;

public class AguardandoAtendimento implements Estado {

	@Override
	public Estado proximoEstado() {
		return new EmAtendimento();
	}

	@Override
	public String toString() {
		return "AguardandoAtendimento";
	}
	
	

}
