package com.codexbox.springboot.app.renuProjects.collections.enumerationExample;

public enum Weeks {
    SUNDAY("first day"),
    MONDAY("second day"),
    TUESDAY("third day"),
    WEDNESDAY("fourth day"),
    THURSDAY("fifth day"),
    FRIDAY("sixth day"),
    SATURDAY("seventh day");
    private  String s;
    public String getvalue(){
        return s;
    }

    Weeks(String s){
        this.s=s;
    }


}
