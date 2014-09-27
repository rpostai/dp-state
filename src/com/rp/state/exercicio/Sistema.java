package com.rp.state.exercicio;

public class Sistema {

	public static void main(String[] args) {
		OrdemServico os1 = new OrdemServico(new AguardandoAtendimento());
		os1.mudarEstado();
		os1.mudarEstado();
		os1.mudarEstado();
		os1.mudarEstado();
	}
}
