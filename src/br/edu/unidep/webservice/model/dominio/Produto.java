package br.edu.unidep.webservice.model.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_produto")
	private Long id;
	
	@Column(name = "nome")
	@Size(max = 50)
	private String nome;
	
	@Column(name = "unidade_medida")
	@Size(max = 20)
	private String unidadeMedida;
	
	@Column(name = "ncm")
	@Size(max = 8)
	private Long ncm;
	
	@Column(name = "valor_compra")
	@Size(max = 10)
	private String valorCompra;
	
	@Column(name = "valor_venda")
	@Size(max = 10)
	private String valorVenda;

	/*GETTERS e SETTERS*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Long getNcm() {
		return ncm;
	}

	public void setNcm(Long ncm) {
		this.ncm = ncm;
	}

	public String getValorcompra() {
		return valorCompra;
	}

	public void setValorcompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getValorvenda() {
		return valorVenda;
	}

	public void setValorvenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", unidadeMedida=" + unidadeMedida + ", ncm=" + ncm + ", valorCompra=" + valorCompra + ", valorVenda=" + valorVenda + "]";
	}
}
