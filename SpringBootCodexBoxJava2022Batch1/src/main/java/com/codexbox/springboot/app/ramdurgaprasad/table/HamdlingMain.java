package com.codexbox.springboot.app.ramdurgaprasad.table;

import com.codexbox.springboot.app.ramdurgaprasad.collections.FileHandling;

import java.io.IOException;

public class HamdlingMain {
    public static void main(String[] args) {
        FileHandling fileHandling = new FileHandling();
        try {
            fileHandling.InputOutputHandling();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
