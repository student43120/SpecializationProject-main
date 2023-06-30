package com.zenit.eventinfoservice.event;

public class Event {
    private static Integer numberOfInstances = 1;
    Integer id;
    Integer month;
    String discovery;

    public Event(Integer month, String discovery) {
        this.month = month;
        this.discovery = discovery;
        id = Event.numberOfInstances++;
    }

    public Integer getId() {
        return id;
    }

    public Integer getmonth() {
        return month;
    }

    public void setmonth(Integer month) {
        this.month = month;
    }

    public String getDiscovery() {
        return discovery;
    }

    public void setDiscovery(String discovery) {
        this.discovery = discovery;
    }
}
