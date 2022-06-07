package enumeration;

public enum EnumDirectionExample {
    EAST("sun rises in east"),
    WEST("sun sets in west"),
    NORTH("north pole"),
    SOUTH("south pole");
private String value;
public String getValue(){return value;}
    EnumDirectionExample(String value){this.value=value;}


    //EnumDirectionExample(String s) {

    }



