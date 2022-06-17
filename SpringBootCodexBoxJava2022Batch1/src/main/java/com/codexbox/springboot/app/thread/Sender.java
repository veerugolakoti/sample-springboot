package com.codexbox.springboot.app.thread;

class Sender {
void send(String msg){
    System.out.println("sending" +msg);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        System.out.println("Thread interrupted");
    }
    System.out.println("\n" +msg+ "sent");
}
}
