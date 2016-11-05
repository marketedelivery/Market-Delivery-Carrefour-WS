package br.com.carrefoursupermercado.interfaces.dados;

import br.com.carrefoursupermercado.classesBasicas.Supermercado;

public interface ISupermercadoDAO extends IDAOGenerico<Supermercado>
{
	public Supermercado pesquisarSupermercadoPorNome(String nome);

	public Supermercado pesquisarSupermercadoPorCNPJ(String cnpj);
}