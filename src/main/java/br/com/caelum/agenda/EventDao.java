package br.com.caelum.agenda;

import br.com.caelum.agenda.models.Event;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EventDao extends CrudRepository<Event, Long> {


    @Override
    List<Event> findAll();
}
