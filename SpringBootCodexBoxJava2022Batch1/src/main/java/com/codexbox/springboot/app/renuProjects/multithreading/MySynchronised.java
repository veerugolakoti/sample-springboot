package com.codexbox.springboot.app.renuProjects.multithreading;

public class MySynchronised extends  Thread{

    Table t;
    public MySynchronised(Table t){
        this.t=t;
    }

    @Override
    public void run() {
        t.mytable(5);
    }
}
