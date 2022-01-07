package br.com.event.scheduler.domain;

import java.time.LocalDateTime;

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

    public Event(String id, String name, LocalDateTime date, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.date = date;
    }

    public static EventBuilder builder() {
        return new EventBuilder();
    }

    public static class EventBuilder {
        private String id;
        private String name;
        private LocalDateTime date;
        private LocalDateTime createdAt;

        EventBuilder() {
        }

        public EventBuilder id(final String id) {
            this.id = id;
            return this;
        }

        public EventBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public EventBuilder date(final LocalDateTime date) {
            this.date = date;
            return this;
        }

        public EventBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Event build() {
            return new Event(id, name, date, createdAt);
        }
    }

}
