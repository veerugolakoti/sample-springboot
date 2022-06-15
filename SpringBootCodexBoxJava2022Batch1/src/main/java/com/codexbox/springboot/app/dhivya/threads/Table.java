package com.codexbox.springboot.app.dhivya.threads;

public class Table {

        synchronized void printTable(int n){
            for(int i=1;i<=10;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(500);
                }catch(Exception e){System.out.println(e);}
            }

        }
    }

    class MyThread1 extends Thread{
        Table t;
        MyThread1(Table t){
            this.t=t;
        }
        public void run(){
            t.printTable(6);
        }

    }
    class MyThread2 extends Thread {
        Table t;

        MyThread2(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable(7);
        }
    }


