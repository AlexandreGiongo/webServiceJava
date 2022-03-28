package br.edu.unidep.webservice.rest;

import java.util.List;

//import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import br.edu.unidep.webservice.model.dominio.Produto;
import br.edu.unidep.webservice.service.ProdutoService;


@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("/produtos")
public class ProdutoREST {

	private ProdutoService service = new ProdutoService();
	
	@GET
	public List<Produto> listar() {
		return service.listar();
	}
	
	@POST
	public Produto cadastrar(Produto objeto) {
		return service.cadastrar(objeto);
	}
	

}
