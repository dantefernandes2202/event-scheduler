package br.com.event.scheduler.adapter.controller.create;

import br.com.event.scheduler.adapter.controller.create.model.CreateEventRequest;
import br.com.event.scheduler.adapter.controller.create.model.CreateEventResponse;
import br.com.event.scheduler.usecase.create.CreateEvent;

public class CreateEventController {

    private CreateEvent createEvent;

    public CreateEventController(CreateEvent createEvent) {
        this.createEvent = createEvent;
    }

    public CreateEventResponse create(CreateEventRequest request) {
        var event = request.toEvent(request);
        return CreateEventResponse.toCreateEventResponse(createEvent.create(event));
    }

}
