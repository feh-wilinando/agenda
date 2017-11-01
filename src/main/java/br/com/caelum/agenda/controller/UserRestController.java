package br.com.caelum.agenda.controller;

import br.com.caelum.agenda.dao.UserDao;
import br.com.caelum.agenda.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    @Autowired
    private UserDao userDao;

    @PostMapping
    public User register(User user){

        User userManaged = userDao.save(user);

        return userManaged;
    }
}
