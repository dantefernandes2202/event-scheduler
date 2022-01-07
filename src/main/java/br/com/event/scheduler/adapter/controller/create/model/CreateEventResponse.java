package br.com.event.scheduler.adapter.controller.create.model;

import br.com.event.scheduler.domain.Event;

import java.time.LocalDateTime;

public class CreateEventResponse {

    private String id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public static CreateEventResponse toCreateEventResponse(Event event) {
        var createEventResponse = new CreateEventResponse();
        createEventResponse.setId(event.getId());
        createEventResponse.setName(event.getName());
        createEventResponse.setDate(event.getDate());
        createEventResponse.setCreatedAt(event.getCreatedAt());
        return createEventResponse;
    }

}