package com.codexbox.springboot.app.codexbox.BhargavTej.mutlithreading;

public class WaitMethodExample {
    int bullets = 20;
   public synchronized void fireBullets(int bulletsToFired){
        for (int i=0;i<bulletsToFired;i++){
            if (bullets==0){
                System.out.println(i-1 + " 20 Bullets are fired" + bullets + "Remains ");
                System.out.println("Now invoking Wait()");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Continue the fire  after reloading");
            }
            bullets--;
        }
       System.out.println("The Firing process is completed");
    }

    public synchronized void reload(){
        System.out.println("Reloading the magazine and resuming " + "The thread using notify();");
        bullets +=20;
        notify();


        //Main Method is in RunnableExample class & line number is 16.

    }


}
