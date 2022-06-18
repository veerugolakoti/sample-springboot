package com.codexbox.springboot.app.ramdurgaprasad.threading.synchronization;

public class Main {
    public static void main(String[] args) {
        Normal normal = new Normal();
        Synchronization2 synchronization2 = new Synchronization2(normal);
        Synchronization1 synchronization1 = new Synchronization1(normal);
        synchronization1.start();
        synchronization2.start();
    }
}
