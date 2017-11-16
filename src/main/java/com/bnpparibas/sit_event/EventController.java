package com.bnpparibas.sit_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bnpparibas.sit_event.service.EventService;

@Controller
public class EventController {
	@Autowired
	EventService eventService;
	
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("events", eventService.findAllEvents());
        return "greeting";
    }

}
