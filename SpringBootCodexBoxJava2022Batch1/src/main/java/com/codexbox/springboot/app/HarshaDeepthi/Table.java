package com.codexbox.springboot.app.HarshaDeepthi;

        class Table {
            void printTable(int n) {
                for (int i = 0; i <= 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                class MyThread1 extends Thread {
                    Table t;

                    MyThread1(Table t) {
                        this.t = t;
                    }

                    public void run() {
                        t.printTable(5);
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


                }}