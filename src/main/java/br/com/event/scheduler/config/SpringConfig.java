package br.com.event.scheduler.config;

import br.com.event.scheduler.adapter.controller.create.CreateEventController;
import br.com.event.scheduler.adapter.repository.sqlite.SQLiteEventRepository;
import br.com.event.scheduler.usecase.create.CreateEvent;
import br.com.event.scheduler.usecase.port.EventRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private EventRepository sqliteEventRepository = new SQLiteEventRepository();

    @Bean
    public CreateEvent createEvent() {
        return new CreateEvent(sqliteEventRepository);
    }

    @Bean
    public CreateEventController createEventController() {
        return new CreateEventController(createEvent());
    }

}
