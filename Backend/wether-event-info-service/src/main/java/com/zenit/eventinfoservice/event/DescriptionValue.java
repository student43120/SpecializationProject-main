package com.zenit.eventinfoservice.event;

import java.util.List;

public class DescriptionValue {

    private String description;
    private int degree;
    private int airHumidity;
    private int windSpeed;
    private static List<DescriptionValue> descriptionList;

    DescriptionValue(String description, int degree, int airHumidity, int windSpeed) {
        this.description = description;
        this.degree = degree;
        this.airHumidity = airHumidity;
        this.windSpeed = windSpeed;
    }

    static {
        descriptionList = List.of(
                new DescriptionValue("Sunny", 25, 50, 10),
                new DescriptionValue("Clear Sky", 20, 60, 5),
                new DescriptionValue("Windy", 15, 70, 15),
                new DescriptionValue("Rainy", 18, 80, 20),
                new DescriptionValue("Cloudy", 22, 65, 10),
                new DescriptionValue("Hot", 32, 85, 10),
                new DescriptionValue("Dizzy", 24, 55, 5),
                new DescriptionValue("Stormy", 19, 90, 30),
                new DescriptionValue("Snowy", -5, 30, 8),
                new DescriptionValue("Bright", 28, 40, 5)
        );
    }

    public static DescriptionValue fromInt(int value) {
        return descriptionList.get(value-1);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(int airHumidity) {
        this.airHumidity = airHumidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "DescriptionValue{" +
                "description='" + description + '\'' +
                ", degree=" + degree +
                ", airHumidity=" + airHumidity +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
