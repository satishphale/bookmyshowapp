package com.bookmyshow.controller;

import com.bookmyshow.domain.Event;
import com.bookmyshow.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/event")
public class EventController {

    @Autowired
    @Qualifier("eventService")
    EventService eventService;

    @PostMapping("/create")
    public ResponseEntity<Event> addEvent(@RequestBody Event event) {
        Event event1 = eventService.addEvent(event);
        return ResponseEntity.ok(event1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable Long id) throws ClassNotFoundException {
        Event event = eventService.getEvent(id);
        return ResponseEntity.ok(event);
    }
}
