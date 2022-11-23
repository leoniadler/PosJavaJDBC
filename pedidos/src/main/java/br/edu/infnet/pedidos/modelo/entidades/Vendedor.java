package br.edu.infnet.pedidos.modelo.entidades;

public class Vendedor {
	 
	Long codigo;
	String descricao;
	String contato;
	
	public Vendedor() {
		
	}
	
	public Vendedor(Long codigo, String descricao, String contato) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.contato = contato;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Vendedor [codigo=" + codigo + ", descricao=" + descricao + ", contato=" + contato + "]";
	}
	
	
}
