package br.edu.unidep.webservice.model.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

//import antlr.collections.List;


@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_pessoa")
	private Long id;
	
	@Column(name = "nome")
	@Size(max = 50)
	private String nome;
	
	@Column(name = "data_nasc")
	@Size(max = 50)
	private String dataNasc;
	
	@Column(name = "sexo")
	@Size(max = 1)
	private String sexo;

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

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/*abaixo ainda n func*/
	
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", dataNasc=" + dataNasc + ", sexo=" + sexo + "]";
	}
	
}

