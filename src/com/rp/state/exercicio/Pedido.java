package com.rp.state.exercicio;

public class Pedido extends Http {
	// 1 - Aguardando aprovação, 2 - Aprovado, 3 - Entregue
	private int estadoPedido; 
	
	public Pedido() {
		this.estadoPedido = 1; // inicia no estado Aguardando aprovação
	}
	public void mudarEstadoPedido() {
		if (estadoPedido == 1) {
			estadoPedido = 2;
		} else if (estadoPedido == 2) {
			estadoPedido = 3;
		} else if (estadoPedido == 3) {
			throw new IllegalStateException();
		}
	}
}