package qts.locadora;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import qts.locadora.locadora.*;
import qts.locadora.service.*;
import qts.locadora.util.*;
import qts.locadora.exception.*;

public class LocacaoServiceTest {

	@Test
	public void testeLocacao() throws Exception{
		/*Teste do Metodo Alugar Jogos*/
		
		Cliente cliente = new Cliente("Antonio");
		Jogo jogo = new Jogo("Harry Potter", 15.00, 1);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao = locacaoService.alugarJogo(cliente, jogo);

		Assert.assertTrue(locacao.getJogo().getNome().equals(jogo.getNome()));
		Assert.assertTrue(locacao.getCliente().getNome().equals(cliente.getNome()));
		Assert.assertTrue("Erro no valor do Jogo", locacao.getValor() == jogo.getValor());
		Assert.assertTrue(new DataUtil().verificarDatasIguais(locacao.getDataRetirada(), new Date()));
	}
	
	@Test (expected = JogoSemNome.class)
	public void testJogoNulo() throws Exception {
		Cliente cliente = new Cliente("Antonio");
		Jogo jogo = new Jogo(null, 0, 10);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao;
		locacao = locacaoService.alugarJogo(cliente, jogo);
	}
	
	@Test (expected = JogoSemNome.class)
	public void testSemNomeJogo() throws Exception {
		Cliente cliente = new Cliente("Antonio");
		Jogo jogo = new Jogo("", 05, 10);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao;
		locacao = locacaoService.alugarJogo(cliente, jogo);
	}
	
	@Test (expected = JogoSemEstoqueException.class)
	public void testJogoSemEstoque() throws Exception {
		Cliente cliente = new Cliente("Antonio");
		Jogo jogo = new Jogo("Harry Potter", 15.00, 0);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao;
		locacao = locacaoService.alugarJogo(cliente, jogo);
	}
	
	@Test (expected = JogoSemValorException.class)
	public void testJogoSemValor() throws Exception {
		Cliente cliente = new Cliente("Antonio");
		Jogo jogo = new Jogo("Harry Potter", 0, 10);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao;
		locacao = locacaoService.alugarJogo(cliente, jogo);
	}
	
	@Test (expected = ClienteSemNome.class)
	public void testSemNome() throws Exception {
		Cliente cliente = new Cliente("");
		Jogo jogo = new Jogo("Harry Potter", 0, 10);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao;
		locacao = locacaoService.alugarJogo(cliente, jogo);
	}
	
	@Test (expected = ClienteSemNome.class)
	public void testNomeNulo() throws Exception {
		Cliente cliente = new Cliente(null);
		Jogo jogo = new Jogo("Harry Potter", 0, 10);
		
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacao;
		locacao = locacaoService.alugarJogo(cliente, jogo);
	}
	
}