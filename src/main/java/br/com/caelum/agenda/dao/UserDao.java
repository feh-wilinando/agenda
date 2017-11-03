package br.com.caelum.agenda.dao;

import br.com.caelum.agenda.models.User;

import java.util.Optional;

import org.springframework.data.repository.Repository;

public interface UserDao extends Repository<User, Long> {

    User save(User user);

    Optional<User> findUserByEmail(String email);
}
