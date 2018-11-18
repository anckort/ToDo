package com.todo.todo.controllers;

import com.todo.todo.entities.Event;
import com.todo.todo.services.EventService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller("/events")
@RequestMapping(value = "event")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping(value = "/getAllEvents")
    public @ResponseBody
    String getAllEvents(){
        return eventService.getAllEvents().toString();
    }

    @PostMapping(value = "/addEvent")
    public @ResponseBody
    String addEvent(@RequestParam(name = "eventBody") String eventBody,
                    @RequestParam(name = "eventDateTime") Date eventDateTime){

        Event event = new Event();
        event.setEventBody(eventBody);
        event.setEventDateTime(eventDateTime);
        eventService.addEvent(event);
        return "ok";
    }

}
