package com.rp.state.exercicio;

public class OrdemServico {

	private Estado estado;

	public OrdemServico(Estado estado) {
		this.estado = estado;
	}

	public void mudarEstado() {
		System.out.println("Estado anterior: " + this.estado);
		this.estado = this.estado.proximoEstado();
		System.out.println("Estado atual: " + this.estado);
	}
}
