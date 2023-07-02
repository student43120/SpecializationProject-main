package com.zenit.eventinfoservice.event;

public enum DescriptionValue {
    SUNNY("Sunny", 25, 50, 10, 1),
    CLEARSKY("Clear Sky", 20, 60, 5, 2),
    WINDY("Windy", 15, 70, 15, 3),
    RAINY("Rainy", 18, 80, 20, 4),
    CLOUDY("Cloudy", 22, 65, 10, 5),
    HOT("Hot", 32, 85, 10, 6),
    DIZZY("Dizzy", 24, 55, 5, 7),
    STORMY("Stormy", 19, 90, 30, 8),
    SNOWY("Snowy", -5, 30, 8, 9),
    BRIGHT("Bright", 28,40,5, 10);

    private String description;
    private int degree;
    private int airHumidity;
    private int windSpeed;

    private int descriptionValue;

    DescriptionValue(String description, int degree, int airHumidity, int windSpeed, int descriptionValue) {
    this.description = description;
    this.degree = degree;
    this.airHumidity = airHumidity;
    this.windSpeed = windSpeed;
    this.descriptionValue = descriptionValue;
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

    public int getDescriptionValue() {
        return descriptionValue;
    }

    public void setDescriptionValue(int descriptionValue) {
        this.descriptionValue = descriptionValue;
    }

    @Override
    public String toString() {
        return "DescriptionValue{" +
                "description='" + description + '\'' +
                ", degree=" + degree +
                ", airHumidity=" + airHumidity +
                ", windSpeed=" + windSpeed +
                ", descriptionValue=" + descriptionValue +
                '}';
    }
}
