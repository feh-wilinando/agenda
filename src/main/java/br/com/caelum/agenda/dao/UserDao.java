package br.com.caelum.agenda.dao;

import br.com.caelum.agenda.models.User;

import org.springframework.data.repository.Repository;

public interface UserDao extends Repository<User, Long> {

    User save(User user);

    User findUserByEmail(String email);
}
