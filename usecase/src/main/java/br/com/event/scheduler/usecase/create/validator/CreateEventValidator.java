package br.com.event.scheduler.usecase.create.validator;

import br.com.event.scheduler.entity.Event;
import br.com.event.scheduler.usecase.create.exception.CreateEventException;

import java.util.Objects;

public class CreateEventValidator {

    public static void validate(final Event event) {
        if (Objects.isNull(event)) throw new CreateEventException("event cannot be null");
        if (Objects.isNull(event.getName()) || event.getName().equals(""))
            throw new CreateEventException("event name cannot be null");
        if (Objects.isNull(event.getDate())) throw new CreateEventException("event date cannot be null");
    }
}
