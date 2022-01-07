package br.com.event.scheduler.config;

import br.com.event.scheduler.adapter.controller.create.CreateEventController;
import br.com.event.scheduler.adapter.controller.findby.FindEventByIdController;
import br.com.event.scheduler.adapter.repository.mock.MockEventRepository;
import br.com.event.scheduler.usecase.create.CreateEvent;
import br.com.event.scheduler.usecase.findby.FindEventById;
import br.com.event.scheduler.usecase.port.EventRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private EventRepository sqliteEventRepository = new MockEventRepository();

    @Bean
    public CreateEvent createEvent() {
        return new CreateEvent(sqliteEventRepository);
    }

    @Bean
    public CreateEventController createEventController() {
        return new CreateEventController(createEvent());
    }

    @Bean
    public FindEventById findEventById() {
        return new FindEventById(sqliteEventRepository);
    }

    @Bean
    public FindEventByIdController findEventByIdController() {
        return new FindEventByIdController(findEventById());
    }

}
