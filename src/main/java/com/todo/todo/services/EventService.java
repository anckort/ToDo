package com.todo.todo.services;

import com.todo.todo.entities.Event;

import java.util.List;

public interface EventService {
    void addEvent(Event event);
    List<Event> getAllEvents();
}
