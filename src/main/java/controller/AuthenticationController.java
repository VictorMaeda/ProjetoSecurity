package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import model.AuthenticationDTO;

@RequestMapping("auth")
@RestController
public class AuthenticationController {
@Autowired
private AuthenticationManager authenticationManager;
@PostMapping("/login")
public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
	var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
	var auth = this.authenticationManager.authenticate(usernamePassword);
	return ResponseEntity.ok().build();
}
}
