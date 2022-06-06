package Enumeration;

public enum Week {
    SUNDAY("first week"),
    MONDAY("second week"),
    TUESDAY("third week"),
    WEDNESDAY("fourth week "),
    THURSDAY("fifth week"),
    FRIDAY("six week"),
    SATURDAY("seventh week");

    private  String value;

    Week(String value) {
        this.value=value;

    }

    public String getValue() {
        
        return value;
    }

}
