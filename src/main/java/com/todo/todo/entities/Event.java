package com.todo.todo.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @SequenceGenerator(name = "events_seq", sequenceName = "events_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "events_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "event")
    private String eventBody;

    @Column(name = "eventDateTime")
    private Date eventDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEventBody() {
        return eventBody;
    }

    public void setEventBody(String eventBody) {
        this.eventBody = eventBody;
    }

    public Date getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(Date eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id) &&
                Objects.equals(eventBody, event.eventBody) &&
                Objects.equals(eventDateTime, event.eventDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventBody, eventDateTime);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventBody='" + eventBody + '\'' +
                ", eventDateTime=" + eventDateTime +
                '}';
    }
}
