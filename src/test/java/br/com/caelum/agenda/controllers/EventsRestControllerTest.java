package br.com.caelum.agenda.controllers;


import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class EventsRestControllerTest {

    @Autowired
    private MockMvc mvc;



    @Test
    public void shouldFetchAllActiveEvents() throws Exception {

        LocalDateTime dateOfEvent = LocalDateTime.of(2017, Month.NOVEMBER, 8, 15, 30, 0);


        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;


        String descriptionOfEvent = "O I Simpósio Inova CEDES/SP é um encontro dos funcionários da centralizadora com as tecnologias que estão em voga na atualidade.\n" +
                "As palestras serão ministradas por profissionais que se destacam no mercado de TI atual, dentro e fora da CAIXA, e empregam no seu dia-a-dia o que há de mais moderno no desenvolvimento de soluções em tecnologia.\n" +
                "Serão quatro dias de muita interação e conhecimento para todos os colegas da TI CAIXA, em que a inovação e o foco no cliente estarão no centro das atenções!";


        mvc.perform(get("/events").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].title", is("I Simpósio Inova CEDES/SP")))
                .andExpect(jsonPath("$[0].date", is(formatter.format(dateOfEvent))))
                .andExpect(jsonPath("$[0].description", is(descriptionOfEvent)))
                .andExpect(jsonPath("$[0].address", is("Av. Guido Caloi, 1000 - Bloco 9")))
                .andExpect(jsonPath("$[0].poster", is("https://novastecnologias.github.io/simposio/img/new_panamerica.png")));


    }

}
