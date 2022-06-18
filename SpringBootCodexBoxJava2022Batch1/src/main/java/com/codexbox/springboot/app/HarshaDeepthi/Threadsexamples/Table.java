package com.codexbox.springboot.app.HarshaDeepthi.Threadsexamples;

        public class Table {
            void printTable(int n) {
                for (int i = 0; i <= 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


                }


                }