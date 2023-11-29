package com.zenit.eventinfoservice.event;

public enum MonthValue {
    JANUARY("January",1),
    FEBRUARY("February",2),
    MARCH("March",3),
    APRIL("April",4),
    MAY("May",5),
    JUNE("June",6),
    JULY("July",7),
    AUGUST("August",8),
    SEPTEMBER("September",9),
    OCTOBER("October",10),
    NOVEMBER("November",11),
    DECEMBER("December",12);

    private int monthValue;
    private String monthName;

    private MonthValue (String monthName, int monthValue)
    {
        this.monthValue = monthValue;
        this.monthName = monthName;

    }

    public static MonthValue fromInt(int value) {
        for (MonthValue month : MonthValue.values()) {
            if (month.monthValue == value) {
                return month;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }
  
    public int getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(int monthValue) {
        this.monthValue = monthValue;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    @Override
    public String toString() {
        return "MonthValue{" +
                "monthValue=" + monthValue +
                ", monthName='" + monthName + '\'' +
                '}';
    }
}


