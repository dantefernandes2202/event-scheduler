package br.com.event.scheduler.usecase.findby.exception;

public class FindEventException extends RuntimeException {

    public FindEventException(final String message) {
        super(message);
    }
}
