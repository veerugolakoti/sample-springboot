package com.codexbox.springboot.app.assesment4;

import com.codexbox.springboot.app.rehana.customepurchaseHistory.Scannerclass;

import java.io.IOException;
import java.sql.SQLException;

public class MainApplication {
    public static void main(String[] args) throws IOException, SQLException {
        Scannerclass sc = new Scannerclass();
        sc.insertCustomerDetails();
        /*JdbcExample jdbcExample = new JdbcExample();
        jdbcExample.studentDeatils();*/

       /* MyRunnable myRunnable = new MyRunnable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i < 15; i++) {
            executorService.execute(myRunnable);

        }
        executorService.shutdown();*/


       /* MyThreadExample3 myThreadEx3 = new MyThreadExample3();
        Thread thread = new Thread(myThreadEx3);
        thread.start();
       ThreadpriorityEx threadpriorityEx  = new ThreadpriorityEx();
        ThreadpriorityEx threadpriorityEx1 = new ThreadpriorityEx();
        threadpriorityEx.setPriority(10);
        threadpriorityEx1.setPriority(6);
        System.out.println("priority of thread Ex is " + threadpriorityEx.getPriority());
        System.out.println("priority of thread Ex1 is " + threadpriorityEx1.getPriority());*/
        /*threadpriorityEx.setPriority(Thread.NORM_PRIORITY);
        threadpriorityEx.start();*/

       /*MyThrea myThread= new MyThread();
       myThread.start();*/
       /* MyThread2 myThread2 = new MyThread2();
        System.out.println(myThread2.getState());
        myThread2.start();
        myThread2.getState();
       // System.out.println(Thread.activeCount());

        try {
            myThread2.join();
            System.out.println("iam joining my thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getState());
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      //  System.out.println(Thread.currentThread().getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(myThread2.getState());

*/


       /* BufferedWriterExample bufferedWriterExample = new BufferedWriterExample();
        bufferedWriterExample.write();
*/
       /* FileReaderExample fileReaderExample = new FileReaderExample();
        fileReaderExample.reader();*/
    }
}

       /*Scanner sc = new Scanner(System.in);
        System.out.println("enter number of students: ");
        int numberofstudents = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < numberofstudents; i++) {

            Student student = new Student();
            System.out.println("enter student id: ");
            student.setStudentid(sc.nextInt());
            System.out.println("enter student name: ");
            student.setStudentname(sc.next());
            System.out.println("enter student address:");
            student.setStudentaddress(sc.next());
            System.out.println("enter student marks: ");
            student.setStudentmarks(sc.nextInt());
            list.add(student);


        }
        int count = 1;
        System.out.println("before sorting  student details:");
        for (Student s : list) {
            s.getGrade();
            System.out.println("details of student " + count++);
            s.details();
            s.caluclate();
            ;
        }
        Student.sortedlist(list);*/
        /*System.out.println();
        Map<String, Student> map = new HashMap<>();
        System.out.println("before sorting student details");
        for (Student std : list) {
            std.details();*/


       /* FileInputoutputExample fileInputoutputExample = new FileInputoutputExample();
        try {
            fileInputoutputExample.fileoperations();
        } catch (IOException e) {
            throw new RuntimeException(e);*/

//BUFFEREXAMPLE

       /* BufferedoutputStreamExample bufferedoutputStreamExample = new BufferedoutputStreamExample();
        try {
            bufferedoutputStreamExample.operations();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

// SequenceInputStream Example
       /* SequenceIpStreamEx sequenceIpStreamEx = new SequenceIpStreamEx();
        try {
            sequenceIpStreamEx.sequence();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
//  }
//FileReaderExample




















