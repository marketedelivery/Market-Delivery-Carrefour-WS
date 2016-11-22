/**
 * 
 */
package br.com.carrefoursupermercado.interfaces.negocio;

import java.util.List;

import br.com.carrefoursupermercado.classesBasicas.Produto;

/**
 * @author Audry Martins
 *
 */
public interface IControladorProduto
{
	// Métodos
	public String cadastrarProduto(Produto produto);

	public String alterarProduto(Produto produto);

	public List<Produto> consultarTodosProdutos();

	public Produto pesquisarProdutoPorNome(String nome);

	public List<Produto> consultarProdutosPorTipo(String tipo);

	public List<Produto> consultarProdutosPorSupermercado(int supermercado);

	public Produto pesquisarProdutoComParametros(String nome, String tipo, String marca);

	public List<Produto> pesquisarProdutoComParametrosLista(String nome, String tipo, String marca);

	public List<Produto> retornarProdutoPorNome(String nome);
}