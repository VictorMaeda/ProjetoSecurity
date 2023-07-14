package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Produto;
import service.ProdutoService;
@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
@Autowired
private ProdutoService service;
@PostMapping
public String cadastrar(@RequestBody Produto objeto) {
	service.cadastrar(objeto);
	return "Produto cadastrado";
}
@GetMapping
public List<Produto> listar(){
	return service.listar();
}
}
