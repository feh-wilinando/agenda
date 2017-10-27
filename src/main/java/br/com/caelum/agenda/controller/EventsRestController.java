package br.com.caelum.agenda.controller;

import br.com.caelum.agenda.models.Event;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("events")
public class EventsRestController {


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> getAll(){
        ArrayList<Event> events = new ArrayList<>();


        LocalDateTime dateOfEvent = LocalDateTime.of(2017, Month.NOVEMBER, 8, 15, 30);

        String descriptionOfEvent = "O I Simpósio Inova CEDES/SP é um encontro dos funcionários da centralizadora com as tecnologias que estão em voga na atualidade.\n" +
                "As palestras serão ministradas por profissionais que se destacam no mercado de TI atual, dentro e fora da CAIXA, e empregam no seu dia-a-dia o que há de mais moderno no desenvolvimento de soluções em tecnologia.\n" +
                "Serão quatro dias de muita interação e conhecimento para todos os colegas da TI CAIXA, em que a inovação e o foco no cliente estarão no centro das atenções!";

        Event event = new Event("I Simpósio Inova CEDES/SP", descriptionOfEvent, dateOfEvent, "Av. Guido Caloi, 1000 - Bloco 9", "https://novastecnologias.github.io/simposio/img/new_panamerica.png");

        events.add(event);

        return events;
    }

}
