package br.com.event.scheduler.config;

import br.com.event.scheduler.infra.controller.create.CreateEventController;
import br.com.event.scheduler.infra.controller.find.FindEventByIdController;
import br.com.event.scheduler.infra.repository.mock.MockEventRepository;
import br.com.event.scheduler.usecase.create.CreateEvent;
import br.com.event.scheduler.usecase.find.FindEvent;
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
    public FindEvent findEventById() {
        return new FindEvent(sqliteEventRepository);
    }

    @Bean
    public FindEventByIdController findEventByIdController() {
        return new FindEventByIdController(findEventById());
    }

}
