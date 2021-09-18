package qts.locadora.locadora;


public class Cliente {

	private String nome;
	
	public Cliente(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Sobrescreve o .toString ---> Imprime o Nome do Cliente
	@Override
	public String toString() {
		return "Nome: " + nome;
	}
	
	// Compara os dados dos Clientes
	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente)obj;
		return nome.equals(cliente.nome);
	}
	
	
	
}
