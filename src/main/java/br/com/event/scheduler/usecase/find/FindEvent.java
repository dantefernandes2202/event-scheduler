package br.com.event.scheduler.usecase.find;

import br.com.event.scheduler.domain.Event;
import br.com.event.scheduler.usecase.find.exception.FindEventException;
import br.com.event.scheduler.usecase.port.EventRepository;

import java.util.Objects;

public class FindEvent {

    private EventRepository repository;

    public FindEvent(EventRepository repository) {
        this.repository = repository;
    }

    public Event findById(String id) {
        if (Objects.isNull(id) || id.equals("")) throw new FindEventException("id cannot be null or empty.");
        return this.repository.findById(id);
    }

}
