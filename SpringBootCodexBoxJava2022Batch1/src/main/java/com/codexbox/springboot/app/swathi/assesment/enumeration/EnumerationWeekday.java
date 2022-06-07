package com.codexbox.springboot.app.swathi.assesment.enumeration;

public class EnumerationWeekday {
    public enum Weekday{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    Weekday n;
    public EnumerationWeekday (Weekday n){
        switch (n){
            case MONDAY:
                System.out.println("today is monday");
            case TUESDAY:
                System.out.println("today is tuesday");
            case WEDNESDAY:
                System.out.println("today is wednesday");
            case THURSDAY:
                System.out.println("today is thursday");
            case FRIDAY:
                System.out.println("today is friday");
            case SATURDAY:
                System.out.println("today is saturday");
                break;

        }
    }

}
