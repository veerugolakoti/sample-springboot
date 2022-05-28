package Assessement;

import java.util.Scanner;

public class Employee {
    Scanner inp = new Scanner(System.in);

    private String name;
    private int id;
    private String address;

    public Employee(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }
}
