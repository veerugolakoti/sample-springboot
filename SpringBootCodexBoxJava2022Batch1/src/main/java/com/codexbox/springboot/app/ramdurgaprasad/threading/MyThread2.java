package com.codexbox.springboot.app.ramdurgaprasad.threading;

import java.io.ByteArrayInputStream;

public class MyThread2 implements Runnable{
    @Override
    public void run() {

        byte[] array = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ByteArrayInputStream byteArrayStreams = new ByteArrayInputStream(array);
        System.out.println(byteArrayStreams.available());
        for (int i = 0; i < 3; i++) {
            byteArrayStreams.read();
        }
        System.out.println(Thread.currentThread().getState());
    }
}
