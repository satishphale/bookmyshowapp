package com.bookmyshow.controller;

import com.bookmyshow.domain.Event;
import com.bookmyshow.service.SearchService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class SearchController {
    @Autowired
    SearchService searchService;

    @GetMapping("/events")
    public ResponseEntity<List<Event>> getEvents() {
        List<Event> events = searchService.getEvents();
        return ResponseEntity.ok(events);
    }

    @GetMapping("/search")
    List<Event> search(@RequestParam String query, @RequestParam(defaultValue = "10") int limit,
                       @RequestParam(defaultValue = "0") int offset) {
        return new ArrayList<>();
    }

}
