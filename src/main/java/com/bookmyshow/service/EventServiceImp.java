package com.bookmyshow.service;

import com.bookmyshow.domain.Event;
import com.bookmyshow.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("eventService")
public class EventServiceImp implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

}
