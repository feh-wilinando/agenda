package br.com.caelum.agenda.controller;

import br.com.caelum.agenda.dao.UserDao;
import br.com.caelum.agenda.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody User user) {

        User userFound = userDao.findUserByEmail(user.getEmail());

        if (userFound == null) {
            User userSaved = userDao.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(userSaved);
        }

        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Usuário não pode ser criado na base");
    }


    @PostMapping("/signin")
    public ResponseEntity signIn(@RequestBody User user) {
        User userFound = userDao.findUserByEmail(user.getEmail());

        if (userFound == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado na base");


        return ResponseEntity.ok(userFound);
    }
}
