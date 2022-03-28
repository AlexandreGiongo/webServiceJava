package br.edu.unidep.webservice.model.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "venda")
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_venda")
	private Long id;
	
	@Column(name = "valor_venda")
	@Size(max = 10)
	private String valorVenda;
	
	@Column(name = "data_venda")
	@Size(max = 50)
	private String dataVenda;
	
	@Column(name = "tipo_venda")
	@Size(max = 1)
	private String tipoVenda;
	
	@ManyToOne
    @JoinColumn(name = "codigo_pessoa")
    private Pessoa codPess;
	
	@ManyToOne
    @JoinColumn(name = "codigo_produto")
    private Produto codProd;
	
	/*GETTERS e SETTERS*/	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getTipoVenda() {
		return tipoVenda;
	}

	public void setTipoVenda(String tipoVenda) {
		this.tipoVenda = tipoVenda;
	}

	public Pessoa getCodPess() {
		return codPess;
	}

	public void setCodPess(Pessoa codPess) {
		this.codPess = codPess;
	}

	public Produto getCodProd() {
		return codProd;
	}

	public void setCodProd(Produto codProd) {
		this.codProd = codProd;
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
		Venda other = (Venda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", valorVenda=" + valorVenda + ", dataVenda=" + dataVenda + ", tipoVenda=" + tipoVenda + ", codPess" + codPess + ", codProd" + codProd + "]";
	}
	
}
