package com.zenit.eventinfoservice.event;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventRepository {

    private final List<Event> events;

    public List<Event> findAll() {
        return events;
    }

    {
         events = List.of(
         new JANUARY("JANUARY",1),
            new FEBRUARY("FEBRUARY",2),
            new MARCH("MARCH",3),
            new APRIL("APRIL",4),
            new MAY("MAY",5),
            new JUNE("JUNE",6),
            new JULY("JULY",7),
            new AUGUST("AUGUST",8),
            new SEPTEMBER("SEPTEMBER",9),
            new OCTOBER("OCTOBER",10),
            new NOVEMBER("NOVEMBER",11),
            new DECEMBER("DECEMBER",12)
        );
    }
}
