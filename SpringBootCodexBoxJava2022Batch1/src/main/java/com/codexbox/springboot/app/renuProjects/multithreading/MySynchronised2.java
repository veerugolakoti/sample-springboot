package com.codexbox.springboot.app.renuProjects.multithreading;

public class MySynchronised2 extends Thread{
    Table t;
    public MySynchronised2(Table t){
        this.t=t;
    }

    @Override
    public void run() {
        t.mytable(6);
    }
}
