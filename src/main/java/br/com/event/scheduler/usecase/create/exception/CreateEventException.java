package br.com.event.scheduler.usecase.create.exception;

public class CreateEventException extends RuntimeException {

    public CreateEventException(final String message) {
        super(message);
    }
}
