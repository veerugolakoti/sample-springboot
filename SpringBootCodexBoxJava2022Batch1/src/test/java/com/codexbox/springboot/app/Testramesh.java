package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Testramesh {
    @Test
    void contextLoads() {
        Set<String> employee = new HashSet<>();
        employee.add("sai");
        employee.add("siva");
        employee.add("sasi");
        employee.add("ram");
        employee.add("sasi");
        employee.add("java");
        employee.add("sai");
        employee.add("java");
        System.out.println(employee.size());System.out.println("All The Elements In Hashset Is:   "+employee);
        List<String> list = new ArrayList<>(employee);
        System.out.println("The index Of 1: "+list.get(1));

    }
}
