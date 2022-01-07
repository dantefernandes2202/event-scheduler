package br.com.event.scheduler.usecase.findby;

import br.com.event.scheduler.domain.Event;
import br.com.event.scheduler.usecase.findby.exception.FindEventException;
import br.com.event.scheduler.usecase.port.EventRepository;

import java.util.Objects;

public class FindEventById {

    private EventRepository repository;

    public FindEventById(EventRepository repository) {
        this.repository = repository;
    }

    public Event findById(String id) {
        if (Objects.isNull(id) || id.equals("")) throw new FindEventException("id cannot be null or empty.");
        return this.repository.findById(id);
    }

}
