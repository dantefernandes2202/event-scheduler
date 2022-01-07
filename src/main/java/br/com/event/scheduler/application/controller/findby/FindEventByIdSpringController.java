package br.com.event.scheduler.application.controller.findby;

import br.com.event.scheduler.adapter.controller.findby.FindEventByIdController;
import br.com.event.scheduler.adapter.controller.model.EventResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindEventByIdSpringController {

    private FindEventByIdController findEventByIdController;

    @Autowired
    public FindEventByIdSpringController(FindEventByIdController findEventByIdController) {
        this.findEventByIdController = findEventByIdController;
    }

    @GetMapping("/events")
    public ResponseEntity<EventResponse> create(@RequestParam String id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(findEventByIdController.findById(id));
    }

}
