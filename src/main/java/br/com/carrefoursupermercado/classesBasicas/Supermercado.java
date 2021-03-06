package br.com.carrefoursupermercado.classesBasicas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_supermercado")
public class Supermercado implements Serializable
{
	// Atributos
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@Column(name = "nome")
	private String nome;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;

	@Column(name = "logoimage")
	private String logoimage;

	// Construtores
	public Supermercado()
	{
		this.nome = "";
		this.latitude = "";
		this.longitude = "";
		this.logoimage = "";
	}

	public Supermercado(String nome, int codigo, String logoimage)
	{
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.logoimage = logoimage;
	}

	// Gets e Sets
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public String getLatitude()
	{
		return latitude;
	}

	public void setLatitude(String latitude)
	{
		this.latitude = latitude;
	}

	public String getLongitude()
	{
		return longitude;
	}

	public void setLongitude(String longitude)
	{
		this.longitude = longitude;
	}

	/**
	 * @return the logoimage
	 */
	public String getLogoimage()
	{
		return logoimage;
	}

	/**
	 * @param logoimage
	 *            the logoimage to set
	 */
	public void setLogoimage(String logoimage)
	{
		this.logoimage = logoimage;
	}
}