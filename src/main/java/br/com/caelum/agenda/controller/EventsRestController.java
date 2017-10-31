package br.com.caelum.agenda.controller;

import br.com.caelum.agenda.EventDao;
import br.com.caelum.agenda.models.Event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/events")
public class EventsRestController {

    @Autowired
    private EventDao eventDao;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> getAll(){

        return eventDao.findAll();
    }

}
