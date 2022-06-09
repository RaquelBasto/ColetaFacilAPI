package br.com.coletafacil.ColetaFacil.service;

import br.com.coletafacil.ColetaFacil.model.User;
import br.com.coletafacil.ColetaFacil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User createUser (User user){
        return repository.save(user);
    }

}
