package br.com.event.scheduler.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Event {

    private String id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime date;

    public String getId() {
        return id;
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Event(String name, LocalDateTime date) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.createdAt = LocalDateTime.now();
        this.date = date;
    }

    public static EventBuilder builder() {
        return new EventBuilder();
    }

    public static class EventBuilder {
        private String name;
        private LocalDateTime date;

        EventBuilder() {
        }

        public EventBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public EventBuilder date(final LocalDateTime date) {
            this.date = date;
            return this;
        }

        public Event build() {
            return new Event(name, date);
        }
    }


}
