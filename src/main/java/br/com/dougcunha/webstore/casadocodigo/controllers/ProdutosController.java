package br.com.dougcunha.webstore.casadocodigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dougcunha.webstore.casadocodigo.daos.ProdutoDAO;
import br.com.dougcunha.webstore.casadocodigo.models.Produto;

@Controller
public class ProdutosController {

    @Autowired
    private ProdutoDAO produtoDao;
	
    @RequestMapping("/produtos/form")
    public String form(){
        return "produtos/form";
    }

    @RequestMapping("/produtos")
    public String gravar(Produto produto){
        System.out.println(produto);
        produtoDao.gravar(produto);
        return "/produtos/ok";
    }
}
