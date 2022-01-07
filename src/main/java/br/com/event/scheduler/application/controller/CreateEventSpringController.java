package br.com.event.scheduler.application.controller;

import br.com.event.scheduler.adapter.controller.create.CreateEventController;
import br.com.event.scheduler.adapter.controller.create.model.CreateEventRequest;
import br.com.event.scheduler.adapter.controller.create.model.CreateEventResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateEventSpringController {

    private CreateEventController createEventController;

    @Autowired
    public CreateEventSpringController(CreateEventController createEventController) {
        this.createEventController = createEventController;
    }

    @PostMapping("/events")
    public ResponseEntity<CreateEventResponse> create(@RequestBody CreateEventRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createEventController.create(request));
    }

}
