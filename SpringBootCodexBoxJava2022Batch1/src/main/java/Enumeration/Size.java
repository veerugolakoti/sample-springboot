package Enumeration;

public enum Size {
    SMALL("it is small"),
    LARGE("it is large"),
    EXTRALARGE("it is too large");
private String value;
Size(String value) {
    this.value=value;

}
 public String getValue() {
    return value;
}

}
