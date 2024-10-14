package com.bookmyshow.service;

import com.bookmyshow.domain.Event;
import com.bookmyshow.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImp implements SearchService {

    @Autowired
    EventRepository eventRepository;

    public List<Event> getEvents() {
        List<Event> events = eventRepository.findAll();
        return events;
    }
}
