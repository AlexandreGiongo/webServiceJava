package br.edu.unidep.webservice.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unidep.webservice.model.dominio.Produto;

public class ProdutoDAO {

	public static EntityManager em = JPAUtil.getEntityManager();
	
	public List<Produto> listar() {	
		return em.createQuery("select p from Produto p", Produto.class).getResultList();
	}
	
	public Produto cadastrar(Produto objeto) {
		em.getTransaction().begin();
		em.persist(objeto);
		em.flush();
		em.getTransaction().commit();
		return objeto;
	}
	
	public void delete(Produto prod) {
        if (!em.contains(prod)) {
        	prod = em.merge(prod);
        }

        em.remove(prod);
    }
	
	
	
}