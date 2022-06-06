package feature_ranjan.enumeration;

public enum EnumExample {
    SUMMER("40c"),
    WINTER("3c "),
    RAINY("18c"),
    SPRING("35c"),
    AUTUMN("10c");
    private String value;

    public String getValue() {
        return value;
    }

    EnumExample(String s) {
        this.value = s;
    }
}
