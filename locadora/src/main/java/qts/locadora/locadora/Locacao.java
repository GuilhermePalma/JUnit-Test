package qts.locadora.locadora;
import java.util.Date;

public class Locacao {
	
	private Cliente cliente;
	private Jogo jogo;
	private Date data_retirada;
	private Date data_devolucao;
	private double valor;
	
	public Locacao() {}
	
	public Locacao(Cliente cliente, Jogo jogo, Date dt_retirada, Date dt_devolucao, double valor) {
		super();
		this.cliente = cliente;
		this.jogo = jogo;
		this.data_retirada = dt_retirada;
		this.data_devolucao = dt_devolucao;
		this.valor = valor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Jogo getJogo() {
		return jogo;
	}
	public void setrJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	
	
	public Date getDataRetirada() {
		return data_retirada;
	}
	public void setDataRetirada(Date retirada) {
		this.data_retirada = retirada;
	}
	
	public Date getDataDevolucao() {
		return data_devolucao;
	}
	public void setDataDevolucao(Date retirada) {
		this.data_devolucao = retirada;
	} 

	public double getValor() {
		return valor;
	}
	public void setvalor(double valor){
		this.valor= valor;
	} 
}
