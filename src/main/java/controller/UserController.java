package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.UserModel;
import service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping
	public String cadastrar(@RequestBody UserModel objeto) {
		service.cadastrar(objeto);
		return "Produto cadastrado";
	}
	@GetMapping
	public List<UserModel> listar(){
		return service.listar();
	}
}
