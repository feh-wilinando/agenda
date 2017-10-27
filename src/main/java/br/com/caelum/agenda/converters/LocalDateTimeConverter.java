package br.com.caelum.agenda.converters;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class LocalDateTimeConverter  {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

//    @Configuration
//    public static class LocalDateTimeToString implements Converter<LocalDateTime, String>{
//
//        @Override
//        public String convert(LocalDateTime localDateTime) {
//            return formatter.format(localDateTime);
//        }
//    }
//
//    @Configuration
//    public static class StringToLocalDateTime implements  Converter<String, LocalDateTime> {
//
//        @Override
//        public LocalDateTime convert(String input) {
//            return LocalDateTime.parse(input, formatter);
//        }
//    }
}
