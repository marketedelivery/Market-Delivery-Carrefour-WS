package br.com.carrefoursupermercado.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.carrefoursupermercado.classesBasicas.Supermercado;
import br.com.carrefoursupermercado.dados.factory.DAOFactory;
import br.com.carrefoursupermercado.interfaces.dados.ISupermercadoDAO;
import br.com.carrefoursupermercado.interfaces.negocio.IControladorSupermercado;
import br.com.carrefoursupermercado.util.Mensagens;

@Path("/supermercado/carrefour")
public class ControladorSupermercado implements IControladorSupermercado
{
	// Atributos
	private ISupermercadoDAO supermercadoDAO;

	Mensagens msg = new Mensagens();

	// Métodos
	@POST
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")
	@Path("/cadastrarSupermercado")
	public String cadastrarSupermercado(Supermercado supermercado)
	{
		supermercadoDAO = DAOFactory.getSupermercadoDAO();
		String mensagem = "";
		try
		{
			supermercadoDAO.inserir(supermercado);
			mensagem = msg.getMsg_supermercado_cadastrado_com_sucesso();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return mensagem;
	}

	@PUT
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")
	@Path("/alterarSupermercado")
	public String alterarSupermercado(Supermercado supermercado)
	{
		supermercadoDAO = DAOFactory.getSupermercadoDAO();
		String mensagem = "";
		try
		{
			supermercadoDAO.alterar(supermercado);
			mensagem = msg.getMsg_supermercado_alterado_com_sucesso();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return mensagem;
	}

	@GET
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")
	@Path("/consultarTodosSupermercados")
	public List<Supermercado> consultarTodosSupermercados()
	{
		supermercadoDAO = DAOFactory.getSupermercadoDAO();
		List<Supermercado> lista = new ArrayList<>();
		lista = supermercadoDAO.consultarTodos();
		if (!lista.isEmpty())
		{
			return lista;
		}
		return null;
	}

	@GET
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")
	@Path("/pesquisarSupermercadoPorNome/{nome}")
	public Supermercado pesquisarSupermercadoPorNome(@PathParam("nome") String nome)
	{
		supermercadoDAO = DAOFactory.getSupermercadoDAO();
		Supermercado s = supermercadoDAO.pesquisarSupermercadoPorNome(nome);
		if (s == null)
		{
			return null;
		}
		return s;
	}

	@GET
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")
	@Path("/pesquisarSupermercadoPorId/{codigo}")
	public Supermercado pesquisarSupermercadoPorCodigo(@PathParam("codigo") int codigo)
	{
		supermercadoDAO = DAOFactory.getSupermercadoDAO();
		Supermercado s = supermercadoDAO.consultarPorId(codigo);
		if (s == null)
		{
			return null;
		}
		return s;
	}

	@GET
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")
	@Path("/pesquisarSupermercadoPorCNPJ/{cnpj}")
	@Override
	public Supermercado pesquisarSupermercadoPorCNPJ(@PathParam("cnpj") String cnpj)
	{
		supermercadoDAO = DAOFactory.getSupermercadoDAO();
		Supermercado s = supermercadoDAO.pesquisarSupermercadoPorCNPJ(cnpj);
		if (s == null)
		{
			return new Supermercado();
		}
		return s;
	}
}