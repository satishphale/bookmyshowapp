package com.bookmyshow.service;


import com.bookmyshow.domain.Event;

import java.util.Optional;

public interface EventService {
    public Event addEvent(Event event);
    public Event getEvent(Long id) throws ClassNotFoundException;
}
