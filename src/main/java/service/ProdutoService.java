package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Produto;
import repositories.ProdutoRepository;

@Service
public class ProdutoService {
@Autowired
private ProdutoRepository repository;

public void cadastrar(Produto produto) {
	repository.save(produto);
}
public List<Produto> listar(){
	return repository.findAll();
}
}
