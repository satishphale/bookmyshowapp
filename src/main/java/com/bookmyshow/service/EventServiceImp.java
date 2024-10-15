package com.bookmyshow.service;

import com.bookmyshow.domain.Event;
import com.bookmyshow.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("eventService")
public class EventServiceImp implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event getEvent(Long id) throws ClassNotFoundException {
        Optional<Event> event = eventRepository.findById(id);

        if(event.isPresent()) {
            return event.get();
        } else {
            throw new ClassNotFoundException();
        }
    }

    @Override
    public Long deleteEvent(Long id) {
        eventRepository.deleteById(id);
        return id;
    }

}
