package com.codexbox.springboot.app.jhansiproject.enumeration;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class EnumerationWeekday {
    public enum WeekDay {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    WeekDay n;
    public EnumerationWeekday (WeekDay n){
        this.n=n;

    }
    public void weekdaymethod(){
        switch(n){
            case MONDAY:
                System.out.println("today is monday");
                break;
            case TUESDAY:
                System.out.println("today is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("today is wednesday");
                break;
            case THURSDAY:
                System.out.println("today is thursday");
                break;
            case FRIDAY:
                System.out.println("today is friday");
                break;
            case SATURDAY:
                System.out.println("today is saturday");
                break;

        }

    }

}
