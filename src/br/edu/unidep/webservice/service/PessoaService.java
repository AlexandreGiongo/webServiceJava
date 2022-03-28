package br.edu.unidep.webservice.service;

import java.util.List;

import br.edu.unidep.webservice.model.dao.PessoaDAO;
import br.edu.unidep.webservice.model.dominio.Pessoa;

public class PessoaService {

	private PessoaDAO dao = new PessoaDAO();
	
	public List<Pessoa> listar() {
		return dao.listar();
	}
	
	public Pessoa cadastrarPess(Pessoa objeto) {
		return dao.cadastrarPess(objeto);
	}
	
}