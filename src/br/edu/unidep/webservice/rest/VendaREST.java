package br.edu.unidep.webservice.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.unidep.webservice.model.dominio.Venda;
import br.edu.unidep.webservice.service.VendaService;

@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("/vendas")
public class VendaREST {

	private VendaService service = new VendaService();

	@GET
	@Path("/olaMundo")
	public String olaMundo() {
		return "Olá Mundo!";
	}
	
	@GET
	public List<Venda> listar() {
		return service.listar();
	}
	
	@POST
	public Venda cadastrarVenda(Venda objeto) {
		return service.cadastrarVenda(objeto);
	}
	
	
	/*
	  POST   - Inserir
	  PUT    - Atualizar
	  DELETE - Deletar
	  GET    - Buscar
	  
	  
	  1. Implementar os métodos acima para Produtos e Vendas.
	  
	  Produto
	  	- Código
	  	- Nome
	  	- Unidade Medida
	  	- NCM
	  	- Valor Compra
	  	- Valor Venda
	  
	  Venda
	  	- Código
	  	- Nome
	  	- Data Nascimento
	  	- Sexo
	  
	  
	  Observação: Realizar o deploy do projeto no tomcat instalado em seu computador, e realizar
	  testes das rotas no Postman.
	  
	  	
	 */

}
