package br.ceub.pidiv.domain;

import java.util.ArrayList;

public abstract class Loja {

	private long id;
	private String nome, cnpj, ie, telefoneFixo, telefoneContato, email;
	private String endereco;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Loja(long id, String nome, String cnpj, String ie, String telefoneFixo, String telefoneContato, String email,
			String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.ie = ie;
		this.telefoneFixo = telefoneFixo;
		this.telefoneContato = telefoneContato;
		this.email = email;
		this.endereco = endereco;
	}

	public Loja() {
		super();
	}

	public abstract boolean gravar();

	public abstract ArrayList<Loja> carregarrLoja(long id);

	public abstract ArrayList<Loja> getListar(String filtro);

	public abstract boolean deletar(long id);

}

