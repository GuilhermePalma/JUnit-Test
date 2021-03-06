package qts.locadora.service;

import java.util.Date;

import qts.locadora.exception.*;
import qts.locadora.locadora.*;
import qts.locadora.util.DataUtil;

public class LocacaoService {

	private final int diasPadrao = 5;
	public int testePublic;
	int testeDefault;
	
	public Locacao alugarJogo(Cliente cliente, Jogo jogo) throws Exception{
		
		// Valida??o CLiente
		if(cliente.getNome() == null || cliente.getNome().isBlank()
			|| cliente.getNome().isEmpty()) {
			throw new qts.locadora.exception.ClienteSemNome();
		}
		
		// Valida??o Jogo
		if(jogo.getNome() == null || jogo.getNome().isBlank()
			|| jogo.getNome().isEmpty()) {
				throw new qts.locadora.exception.JogoSemNome();
		}else if(jogo.getQuantidadeEstoque() == 0) {
			throw new qts.locadora.exception.JogoSemEstoqueException();
		} else if(jogo.getValor() == 0) {
			throw new qts.locadora.exception.JogoSemValorException();
		}
		
		Locacao locacao = new Locacao();
		locacao.setCliente(cliente);
		locacao.setrJogo(jogo);
		locacao.setvalor(jogo.getValor());
		locacao.setDataRetirada(new Date());
		
		Date devolucao = new DataUtil().addDias(new Date(), diasPadrao);
		locacao.setDataDevolucao(devolucao);
		return locacao;
	}
	
	
	
}
