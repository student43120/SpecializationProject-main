package com.zenit.eventinfoservice.event;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEventList() {
        return eventRepository.findAll();
    }
}
