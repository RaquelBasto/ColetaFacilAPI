package br.com.coletafacil.ColetaFacil.controller;

import br.com.coletafacil.ColetaFacil.model.User;
import br.com.coletafacil.ColetaFacil.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/register")
    public User createUser(@RequestBody @Valid User user){
        return service.createUser(user);
    }
}
