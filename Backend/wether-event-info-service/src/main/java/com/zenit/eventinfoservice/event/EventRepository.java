package com.zenit.eventinfoservice.event;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;

@Repository
public class EventRepository {

    private final List<Event> events;

    public List<Event> findAll() {
        return events;
    }

    Random random = new Random();
    int randomValueOfMonth;
    int randomValueOfWeather;

    MonthValue monthValue;

    {
         events = List.of(
                 new Event(MonthValue.JANUARY,DescriptionValue.BRIGHT),
                 new Event(MonthValue.FEBRUARY,DescriptionValue.CLEARSKY),
                 new Event(MonthValue.MARCH,DescriptionValue.CLOUDY),
                 new Event(MonthValue.APRIL,DescriptionValue.SUNNY),
                 new Event(MonthValue.MAY,DescriptionValue.WINDY),
                 new Event(MonthValue.JUNE,DescriptionValue.DIZZY),
                 new Event(MonthValue.JULY,DescriptionValue.BRIGHT),
                 new Event(MonthValue.AUGUST,DescriptionValue.HOT),
                 new Event(MonthValue.SEPTEMBER,DescriptionValue.RAINY),
                 new Event(MonthValue.OCTOBER,DescriptionValue.STORMY),
                 new Event(MonthValue.NOVEMBER,DescriptionValue.WINDY),
                 new Event(MonthValue.DECEMBER,DescriptionValue.SNOWY)
                 );
    }

    public int getRandomValueOfMonth() {
        return random.nextInt(1,13);
    }

    public int getRandomValueOfWeather() {
        return random.nextInt(1,11);
    }
}


