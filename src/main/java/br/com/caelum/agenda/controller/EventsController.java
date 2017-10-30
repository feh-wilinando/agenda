package br.com.caelum.agenda.controller;

import br.com.caelum.agenda.models.Event;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/events")
public class EventsController {



    @GetMapping
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView("events/list");

        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView form(Event event){

        ModelAndView modelAndView = new ModelAndView("events/form");



        return modelAndView;
    }


    @PostMapping
    public ModelAndView save(Event event){

        System.out.println(event);

        return new ModelAndView("redirect:events");
    }




}
