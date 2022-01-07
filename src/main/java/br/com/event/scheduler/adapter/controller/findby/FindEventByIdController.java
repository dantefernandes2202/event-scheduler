package br.com.event.scheduler.adapter.controller.findby;

import br.com.event.scheduler.adapter.controller.model.EventResponse;
import br.com.event.scheduler.usecase.findby.FindEventById;

public class FindEventByIdController {

    private FindEventById findEventById;

    public FindEventByIdController(FindEventById findEventById) {
        this.findEventById = findEventById;
    }

    public EventResponse findById(String id) {
        return EventResponse.toEventResponse(findEventById.findById(id));
    }
}
