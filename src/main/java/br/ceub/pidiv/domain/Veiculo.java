package br.ceub.pidiv.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "numero_documento")
	private String numeroDocumento;
	
	public Veiculo() {
	}
	public Veiculo(Integer id, String descricao, String placa, String numeroDocumento) {
		this.id = id;
		this.descricao = descricao;
		this.placa = placa;
		this.numeroDocumento = numeroDocumento;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
}
