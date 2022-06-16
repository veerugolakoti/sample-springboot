package com.codexbox.springboot.app.TejaAravind.MultiThreading;


class Sender
{
    public void send(String msg)
    {
        System.out.println("Sending\t" + msg );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// Class for send a message using Threads
class ThreadedSend extends Thread
{
    private String msg;
    Sender sender;

    // Receives a message object and a string
    // message to be sent
    ThreadedSend(String m, Sender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        // Only one thread can send a message
        // at a time.
        synchronized(sender)
        {
            // synchronizing the send object
            sender.send(msg);
        }
    }
}

// Driver class
public class SyncDemo
{
    public static void main(String args[])
    {
        Sender send = new Sender();
        ThreadedSend S1 =
                new ThreadedSend( " Hi " , send );
        ThreadedSend S2 =
                new ThreadedSend( " Bye " , send );

        // Start two threads of ThreadedSend type
      /*  S1.setPriority(1);
        S2.setPriority(10);*/
        S2.start();
        S1.start();

        // wait for threads to end
        /*try
        {
            S1.join();
            S2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }*/
    }
}
