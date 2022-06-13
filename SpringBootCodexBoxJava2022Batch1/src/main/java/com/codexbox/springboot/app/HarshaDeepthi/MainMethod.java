package com.codexbox.springboot.app.HarshaDeepthi;

import com.codexbox.springboot.app.HarshaDeepthi.Fileoperations.Bufferinputstreamexample;
import com.codexbox.springboot.app.HarshaDeepthi.Fileoperations.Fileoutputstreamexample;
import com.codexbox.springboot.app.HarshaDeepthi.Fileoperations.Inputoutputstreamreader;
import com.codexbox.springboot.app.HarshaDeepthi.Fileoperations.Sequencestreamexample;
import com.codexbox.springboot.app.HarshaDeepthi.Methodoverriding.Animal;
import org.springframework.boot.web.servlet.server.Session;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainMethod {
    public static void main(String[] args) {
       /* StudentGrade stGrade = new StudentGrade(); //studentgrade
        stGrade.studentAndTheirGrades();*/



      /* System.out.println(Seasons.Summer.name());      //enumexample
        System.out.println(Seasons.Spring.ordinal());
        System.out.println(Seasons.Winter.getvalue());
        System.out.println(Seasons.valueOf(Seasons.Spring.name()));




        Map<String,Integer> mymap=new HashMap<>();   //hashmap null checking
        mymap.put("harsha",3);
        mymap.put("keerthi",4);
        mymap.put("sai",5);
        mymap.put("ranjan",8);
        mymap.put(null,5);
        mymap.put(null,9);
        System.out.println(mymap.get(null));
        System.out.println(mymap);*/

       /* Inputoutputstreamreader inputreader=new Inputoutputstreamreader();
        inputreader.findInputOutputOperations();*/



     /*   String str="i am harshadeepthi from bhadrachalam";
        System.out.println(str.length());
        Inputoutputstreamreader inputs = new Inputoutputstreamreader() ;
        inputs.findInputOutputOperations();*/


    /*Animal a1=new Animal();
        System.out.println(a1.eat());
        Dog a3=new Dog();
        System.out.println(a3.eat());
        Animal a2=new Dog();
        System.out.println(a2.eat());
*/

       /* Bufferinputstreamexample br=new Bufferinputstreamexample();
        br.buffermethod();
*/


       /* Fileoutputstreamexample fs=new Fileoutputstreamexample();
        fs.fileoutputex();
*/
        Mythread mythread1=new Mythread();
        mythread1.mythread();

        Mythread mythread2=new Mythread();
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(mythread2.getId());
        System.out.println(mythread2.getName());
        Mythread mythread3=new Mythread();
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(mythread3.getId());
        System.out.println(mythread3.getName());
        mythread1.run();
        Thread thread=new Thread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        thread.run();
        Mythread mythread4=new Mythread();
        System.out.println(mythread4.getId());
        System.out.println(mythread4.getName());

/*Setnameexample se=new Setnameexample();
se.run();*/


    }
}
