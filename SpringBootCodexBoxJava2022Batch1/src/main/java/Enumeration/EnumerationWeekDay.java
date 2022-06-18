package Enumeration;



public class EnumerationWeekDay {
    public enum Months {
        JANUARY,
        FEBRAURY,
        MARCH,
        APRIL,
        MAY,
        JUNE
    }

    Months month;

    public EnumerationWeekDay(Months month) {
        this.month = month;
    }

    public void months() {
        switch (month) {
            case JANUARY:
                System.out.println("This is january month");
                break;
            case FEBRAURY:
                System.out.println("This is febrauary month");
                break;
            case MARCH:
                System.out.println("This is march month");
                break;
            case APRIL:
                System.out.println("This is april month");
                break;
            case MAY:
                System.out.println("This is may month");
                break;
        }
    }
}
