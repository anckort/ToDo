package com.todo.todo.services;

import com.todo.todo.entities.Event;
import com.todo.todo.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
