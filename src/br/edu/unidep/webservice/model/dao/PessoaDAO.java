package br.edu.unidep.webservice.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unidep.webservice.model.dominio.Pessoa;

public class PessoaDAO {

	public static EntityManager em = JPAUtil.getEntityManager();
	
	public List<Pessoa> listar() {	
		return em.createQuery("select p from Pessoa p", Pessoa.class).getResultList();
	}
	
	public Pessoa cadastrarPess(Pessoa objeto) {
		em.getTransaction().begin();
		em.persist(objeto);
		em.flush();
		em.getTransaction().commit();
		return objeto;
	}
	
}