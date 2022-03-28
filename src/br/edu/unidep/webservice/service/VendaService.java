package br.edu.unidep.webservice.service;

import java.util.List;

import br.edu.unidep.webservice.model.dao.VendaDAO;
import br.edu.unidep.webservice.model.dominio.Venda;

public class VendaService {

	private VendaDAO dao = new VendaDAO();
	
	public List<Venda> listar() {
		return dao.listar();
	}
	
	public Venda cadastrarVenda(Venda objeto) {
		return dao.cadastrarVenda(objeto);
	}
	
}