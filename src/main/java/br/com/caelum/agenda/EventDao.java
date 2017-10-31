package br.com.caelum.agenda;

import br.com.caelum.agenda.models.Event;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface EventDao extends Repository<Event, Long> {

    List<Event> findAll();

    void save(Event e);
}
