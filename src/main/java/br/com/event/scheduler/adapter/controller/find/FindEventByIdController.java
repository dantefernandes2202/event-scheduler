package br.com.event.scheduler.adapter.controller.find;

import br.com.event.scheduler.adapter.controller.model.EventResponse;
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
