package br.com.event.scheduler.adapter.repository.mock;

import br.com.event.scheduler.domain.Event;
import br.com.event.scheduler.usecase.port.EventRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public class MockEventRepository implements EventRepository {

    @Override
    public Event save(Event event) {
        return Event.builder()
                .id(UUID.randomUUID().toString())
                .name(event.getName())
                .date(event.getDate())
                .createdAt(LocalDateTime.now())
                .build();
    }

    @Override
    public Event findById(String id) {
        return Event.builder()
                .id(id)
                .name("Mock")
                .date(LocalDateTime.now())
                .createdAt(LocalDateTime.now())
                .build();
    }

}
