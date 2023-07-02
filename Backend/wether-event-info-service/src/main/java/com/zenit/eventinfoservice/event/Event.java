package com.zenit.eventinfoservice.event;


public class Event {
    private static Integer numberOfInstances = 1;
    Integer id;
    MonthValue month;
    DescriptionValue description;

    public Event(MonthValue month, DescriptionValue description) {
        this.month = month;
        this.description = description;
        this.id = Event.numberOfInstances++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MonthValue getMonth() {
        return month;
    }

    public void setMonth(MonthValue month) {
        this.month = month;
    }

    public DescriptionValue getDescription() {
        return description;
    }

    public void setDescription(DescriptionValue description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "month=" + month +
                ", description=" + description +
                '}';
    }
}

