package br.com.carrefoursupermercado.interfaces.dados;

import java.util.List;

import br.com.carrefoursupermercado.classesBasicas.Produto;

public interface IProdutoDAO extends IDAOGenerico<Produto>
{
	public Produto pesquisarProdutoPorNome(String nome);

	public List<Produto> pesquisarProdutoPorSupermercado(int supermercado);

	public List<Produto> consultarProdutosPorTipo(String tipo);

	public Produto pesquisarProdutoComParametros(String nome, String tipo, String marca);
	
	public List<Produto> pesquisarProdutoComParametrosLista(String nome, String tipo, String marca);

	public List<Produto> retornarProdutoPorNome(String nome);
}