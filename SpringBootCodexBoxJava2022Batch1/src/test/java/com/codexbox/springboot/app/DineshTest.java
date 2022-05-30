package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;

import static javafx.scene.input.KeyCode.T;

public class DineshTest {

    @Test
    void contextLoads() {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();


        linkedHashSet.add("dinesh");
        linkedHashSet.add("jansi");
        linkedHashSet.add("vasu");
        linkedHashSet.add("ravali");
        linkedHashSet.add("renuka");
        linkedHashSet.add("vidya");
        linkedHashSet.add("abhilash");
        linkedHashSet.add("junaid");
        linkedHashSet.add("dinesh");

        System.out.println(linkedHashSet.size());



        }
    }


