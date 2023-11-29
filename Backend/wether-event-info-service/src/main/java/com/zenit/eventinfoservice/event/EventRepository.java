package com.zenit.eventinfoservice.event;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EventRepository {

    private final List<Event> events;

    public List<Event> findAll() {
        return events;
    }

    Random random = new Random();

    {
        Set<Event> listOfEvents = new HashSet<>();
        for (int i = 0; i < 500; i++) {
            listOfEvents.add(new Event(MonthValue.fromInt(getRandomValueOfMonth()),
                    DescriptionValue.fromInt(getRandomValueOfWeather()),getRandomValueOfYear()));
        }

        events = listOfEvents.stream()
                .sorted((eventF,eventS) -> Integer.compare(eventS.getYear(),eventF.getYear())).toList();
    }

    public int getRandomValueOfMonth() {
        return random.nextInt(1,13);
    }

    public int getRandomValueOfWeather() {
        return random.nextInt(1,11);
    }

    public int getRandomValueOfYear() {
        return random.nextInt(1800,2025);
    }
}