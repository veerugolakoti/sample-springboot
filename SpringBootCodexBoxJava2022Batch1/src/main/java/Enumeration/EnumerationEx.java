package Enumeration;

public class EnumerationEx {
   public enum Seasons {
        SUMMER,
       WINTER,
       RAINY,
       SPRING
    }

    public void seasons() {

       switch(Seasons.SUMMER) {
           case  RAINY:
               System.out.println("This is rainy season");
               break;
           case SUMMER:
               System.out.println("This is summer season");
               break;
           case WINTER:
               System.out.println("This is winter season");
               break;
       }

        System.out.println("\nLooping throug enums: ");
        for(Seasons seasons: Seasons.values()) {
            System.out.println(seasons);
        }
    }
}
