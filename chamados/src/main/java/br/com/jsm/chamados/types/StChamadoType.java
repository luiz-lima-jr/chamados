package br.com.jsm.chamados.types;

/**
 * Novo
 * Em Andamento
 * Encerrado
 * Cancelado
 * 
 * @author luiz.lima
 *
 */
public enum StChamadoType {
	SELECIONE(0), NOVO(1), EM_ANDAMENTO(2), ENCERRADO(3), CANCELADO(4);
	
	private final int value;
	
	StChamadoType(int value){
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

}
