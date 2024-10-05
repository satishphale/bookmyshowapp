package com.bookmyshow.service;

import com.bookmyshow.domain.Event;
import com.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {


    public List<Event> getEvents() {
        return new ArrayList<>();
    }
}
