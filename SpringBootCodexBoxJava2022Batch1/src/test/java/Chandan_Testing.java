import com.codexbox.springboot.app.map.MapExample;
import enumeration.EnumDirectionExample;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Chandan_Testing {
    @Test
    void duplicateElements(){
        DuplicateElements duplicateElements = new DuplicateElements();
        duplicateElements.duplicateElements();
    }
    @Test
           public void mapExample() {
        MapExample map = new MapExample();
        map.mapExamples();
    }

    @Test
   public void enumTest(){
        EnumDirectionExample.values();
    }
    @Test
    public void enumTests(){
        List<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        System.out.println(EnumDirectionExample.EAST.name());
        System.out.println(EnumDirectionExample.EAST.ordinal());
       System.out.println(EnumDirectionExample.EAST.getValue());

       /* System.out.println(EnumDirectionExample.WEST.name());
        System.out.println(EnumDirectionExample.WEST.ordinal());
        System.out.println(EnumDirectionExample.WEST.getValue());

        System.out.println(EnumDirectionExample.NORTH.name());
        System.out.println(EnumDirectionExample.NORTH.ordinal());
        System.out.println(EnumDirectionExample.NORTH.getValue());

        System.out.println(EnumDirectionExample.SOUTH.name());
        System.out.println(EnumDirectionExample.SOUTH.ordinal());
        System.out.println(EnumDirectionExample.SOUTH.getValue());*/
    }
}
