package qts.locadora.locadora;

public class Jogo {

	private String nome;
	private double valor;
	private int quantidade_estoque;
	
	public Jogo(String nome, double valor, int quantidade_estoque) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade_estoque = quantidade_estoque;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidadeEstoque() {
		return quantidade_estoque;
	}
	
	public void setQuantidadeEstoque(int quantidade) {
		this.quantidade_estoque = quantidade;
	}
	
	
}
