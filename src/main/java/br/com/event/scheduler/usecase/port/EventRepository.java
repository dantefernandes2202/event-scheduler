package br.com.event.scheduler.usecase.port;

import br.com.event.scheduler.domain.Event;

public interface EventRepository {

    public Event save(Event event);

    public Event findById(String id);

}
