package br.edu.unidep.webservice.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unidep.webservice.model.dominio.Venda;

public class VendaDAO {

	public static EntityManager em = JPAUtil.getEntityManager();
	
	public List<Venda> listar() {	
		return em.createQuery("select p from Venda p", Venda.class).getResultList();
	}
	
	public Venda cadastrarVenda(Venda objeto) {
		em.getTransaction().begin();
		em.persist(objeto);
		em.flush();
		em.getTransaction().commit();
		return objeto;
	}
	
}