package com.bnpparibas.sit_event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bnpparibas.sit_event.model.Event;
import com.bnpparibas.sit_event.service.EventService;

@Controller
public class EventController {
	@Autowired
	EventService eventService;
	
    @RequestMapping(value = "/findAllEvents", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Event> findAllEvents() {
        return eventService.findAllEvents();
    }

}
