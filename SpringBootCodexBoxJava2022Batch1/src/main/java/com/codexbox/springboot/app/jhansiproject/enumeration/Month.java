package com.codexbox.springboot.app.jhansiproject.enumeration;

public enum Month {
    JAN("REPRESENTED AS JAN"),
    FEB("REPRESENTED AS FEB"),
    MARCH("REPRESENTED AS MARCH"),
    APRIL("REPRESENTED AS APRIL"),
    MAY("REPRESENTED AS MAY");

private String s;
public String getvalue(){
    return s;
}
    Month(String s) {
       this.s=s;
    }
}





