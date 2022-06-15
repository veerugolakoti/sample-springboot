package com.codexbox.springboot.app.renuProjects.multithreading;


    public class MyThread2 extends Thread {
        public void run() {
            int s = 10, v = 2;
            int mul = s * v;
            System.out.println("my second thread");
            System.out.println("mul is: "+ mul);


    }
}
