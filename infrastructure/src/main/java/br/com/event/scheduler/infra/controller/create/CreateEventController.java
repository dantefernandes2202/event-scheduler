package br.com.event.scheduler.infra.controller.create;

import br.com.event.scheduler.infra.controller.create.model.CreateEventRequest;
import br.com.event.scheduler.infra.controller.model.EventResponse;
import br.com.event.scheduler.usecase.create.CreateEvent;

public class CreateEventController {

    private CreateEvent createEvent;

    public CreateEventController(CreateEvent createEvent) {
        this.createEvent = createEvent;
    }

    public EventResponse create(CreateEventRequest request) {
        var event = request.toEvent(request);
        return EventResponse.toEventResponse(createEvent.create(event));
    }

}
