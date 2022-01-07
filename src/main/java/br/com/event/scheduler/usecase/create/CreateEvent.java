package br.com.event.scheduler.usecase.create;

import br.com.event.scheduler.domain.Event;
import br.com.event.scheduler.usecase.create.validator.CreateEventValidator;
import br.com.event.scheduler.usecase.port.EventRepository;
public class CreateEvent {

    private EventRepository repository;

    public CreateEvent(EventRepository repository) {
        this.repository = repository;
    }

    public Event create(Event event) {
        CreateEventValidator.validate(event);
        return this.repository.save(event);
    }

}
