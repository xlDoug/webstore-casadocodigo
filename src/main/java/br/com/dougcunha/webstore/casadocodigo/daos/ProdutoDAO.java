package br.com.dougcunha.webstore.casadocodigo.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.dougcunha.webstore.casadocodigo.models.Produto;

@Repository
public class ProdutoDAO {
	
	@PersistenceContext
    private EntityManager manager;
	
	public void gravar(Produto produto){
		
	}

}
