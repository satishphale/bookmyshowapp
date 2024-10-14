package com.bookmyshow.service;

import com.bookmyshow.domain.Event;

import java.util.List;

public interface SearchService {
    public List<Event> getEvents();
}