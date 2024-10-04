package com.bookmyshow.controller;

import com.bookmyshow.domain.Event;
import com.bookmyshow.service.SearchService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {
    @Autowired
    SearchService searchService;

    @GetMapping("/api/events/v1")
    public ResponseEntity<List<Event>> getEvents() {
        List<Event> events = searchService.getEvents();
        return ResponseEntity.ok(events);
    }

    @GetMapping("/api/search/v1")
    List<Event> search() {
        return new ArrayList<>();
    }

}
