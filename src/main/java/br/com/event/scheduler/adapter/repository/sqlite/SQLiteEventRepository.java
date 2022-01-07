package br.com.event.scheduler.adapter.repository.sqlite;

import br.com.event.scheduler.domain.Event;
import br.com.event.scheduler.usecase.port.EventRepository;

public class SQLiteEventRepository implements EventRepository {

    @Override
    public Event save(Event event) {
        return Event.builder()
                .name(event.getName())
                .date(event.getDate())
                .build();
    }
}
