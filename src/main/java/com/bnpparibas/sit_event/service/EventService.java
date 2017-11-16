package com.bnpparibas.sit_event.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnpparibas.sit_event.model.Event;
import com.bnpparibas.sit_event.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;


    public List<Event> findAllEvents() {
        
        return eventRepository.findAll();
    }
}
