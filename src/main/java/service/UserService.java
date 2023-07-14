package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.UserModel;
import repositories.UserRepository;
@Service
public class UserService {
@Autowired
private UserRepository repository;

public void cadastrar(UserModel objeto) {
	repository.save(objeto);
}
public List<UserModel> listar(){
	return repository.findAll();
}
}