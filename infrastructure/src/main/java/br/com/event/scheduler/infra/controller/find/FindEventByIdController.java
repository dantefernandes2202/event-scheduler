package br.com.event.scheduler.infra.controller.find;

import br.com.event.scheduler.infra.controller.model.EventResponse;
import br.com.event.scheduler.usecase.find.FindEvent;

public class FindEventByIdController {

    private FindEvent findEventById;

    public FindEventByIdController(FindEvent findEventById) {
        this.findEventById = findEventById;
    }

    public EventResponse findById(String id) {
        return EventResponse.toEventResponse(findEventById.findById(id));
    }
}
