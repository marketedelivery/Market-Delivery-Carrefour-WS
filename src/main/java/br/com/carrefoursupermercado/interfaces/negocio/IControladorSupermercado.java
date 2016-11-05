/**
 * 
 */
package br.com.carrefoursupermercado.interfaces.negocio;

import java.util.List;

import br.com.carrefoursupermercado.classesBasicas.Supermercado;

/**
 * @author Audry Martins
 *
 */
public interface IControladorSupermercado
{
	// Métodos
	public String cadastrarSupermercado(Supermercado supermercado);

	public String alterarSupermercado(Supermercado supermercado);

	public List<Supermercado> consultarTodosSupermercados();

	public Supermercado pesquisarSupermercadoPorNome(String nome);

	public Supermercado pesquisarSupermercadoPorCodigo(int codigo);
}