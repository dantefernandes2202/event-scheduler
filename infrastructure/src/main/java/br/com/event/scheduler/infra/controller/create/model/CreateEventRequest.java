package br.com.event.scheduler.infra.controller.create.model;

import br.com.event.scheduler.entity.Event;

import java.time.LocalDateTime;

public class CreateEventRequest {

    private String name;
    private LocalDateTime date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Event toEvent(CreateEventRequest request) {
        return Event.builder()
                .name(request.getName())
                .date(request.getDate())
                .build();
    }
}