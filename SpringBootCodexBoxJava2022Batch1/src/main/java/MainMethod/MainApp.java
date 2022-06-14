package MainMethod;

import Collections.*;
import Enumeration.EnumerationEx;
import Enumeration.EnumerationWeekDay;
import FilesOperations.*;
import FilesOperationsChallenge.*;
import MultiThreadeing.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.PriorityQueue;

import static MultiThreadeing.ThreadPriorityEx2.addition;

public class MainApp {
    public static void main(String[] args) throws IOException {

        /*StackExample ske = new StackExample();
        ske.stackExample();*/

        /*DuplicateElement dpl = new DuplicateElement();
        dpl.duplicateElement();*/

        /*HashsetExample hset = new HashsetExample();
        hset.hashSet();*/

        /*TreesetExample tset = new TreesetExample();
        tset.treeSet();*/

        /*LinkedHashset lhaset = new LinkedHashset();
        lhaset.linkedHashSet();*/

        /*MapExample mpx = new MapExample();
        mpx.mapExample();*/

        /*PriorityQueueExample pqueue = new PriorityQueueExample();
        pqueue.priorityQueue();*/

        /*ArrayListEx arr = new ArrayListEx();
        arr.arrayList();*/

        /*EnumerationEx enums = new EnumerationEx();
        enums.seasons();*/

        /*FileIOOperations files = new FileIOOperations();
        files.filesoperations();*/

        /*ReadAfile rfile = new ReadAfile();
        rfile.readaFile();*/

        /*WriteaFile write = new WriteaFile();
        write.writeFile();*/

        /*WriteArrayToFiles writeArray = new WriteArrayToFiles();
        writeArray.writearray();*/

        /*CreateFile files = new CreateFile();
        files.createFile();*/

        /*FilesInfo filesIn = new FilesInfo();
        filesIn.filesInfo();*/

        /*FilesList filelist = new FilesList();
        filelist.filesList();*/

        /*FileReaderAndWriter readwrite = new FileReaderAndWriter();
        readwrite.fileRandW();*/

        /*WriterAndReader readWrite = new WriterAndReader();
        readWrite.writerReader();*/

        /*Fileread reader = new Fileread();
        reader.fileread();*/

        /*BufferInfiles buffers = new BufferInfiles();
        buffers.buffersfiles();*/

        /*CreateFile files = new CreateFile();
        files.createFile();*/

        /*CreateTemp temp = new CreateTemp();
        temp.tempFile();*/

        /*RenameFile rename = new RenameFile();
        rename.renamefile();*/

        /*SetReadable readable = new SetReadable();
        readable.setreadable();*/

        /*CompareFilepath compares = new CompareFilepath();
        compares.comparePath();*/

        /*CopyContentToAnother copy = new CopyContentToAnother();
        copy.copyContent();*/

        /*FilesContentToArray filesarray = new FilesContentToArray();
        filesarray.contentArray();*/

       /* BufferedReadMultipeLines bufferLines = new BufferedReadMultipeLines();
        bufferLines.multipleLines();*/

        /*SeqenceStreams sequence = new SeqenceStreams();
        sequence.sequencestream();*/

        /*MyThread thread = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        thread.run();
        thread2.run();
        System.out.println();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println();
        System.out.println(thread2.getId());
        System.out.println(thread2.getName());
        System.out.println();
        System.out.println(thread3.getId());
        System.out.println(thread3.getName());
        System.out.println();
        Thread  threads = new Thread();
        Thread threads1 = new Thread();
        System.out.println(threads.getId());
        System.out.println(threads.getName());
        System.out.println();
        System.out.println(threads1.getId());
        System.out.println(threads1.getName());*/


        /*for(int i = 0; i < 10; i++) {
            MyThreadExample threadex = new MyThreadExample();
            threadex.start();
        }
        MyThreadExample threadx = new MyThreadExample();*/

        /*MyThreadExample2 thread2 = new MyThreadExample2();
        thread2.start();
        System.out.println("State of the thread: " + thread2.getState());
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }*/

        /*ThreadPriorityExamples tpriority1 = new ThreadPriorityExamples();
        ThreadPriorityExamples tpriority2 = new ThreadPriorityExamples();
        ThreadPriorityExamples tpriority3 = new ThreadPriorityExamples();

        System.out.println("Priority of thread: " + tpriority1.getPriority());
        System.out.println("Priority of thread: " + tpriority2.getPriority());
        System.out.println("Priority of thread: " + tpriority3.getPriority());

        tpriority1.setPriority(3);
        tpriority2.setPriority(2);
        tpriority3.setPriority(6);

        System.out.println("Priority of thread: " + tpriority1.getPriority());
        System.out.println("Priority of thread: " + tpriority2.getPriority());
        System.out.println("Priority of thread: " + tpriority3.getPriority());

        tpriority1.run();
        System.out.println(tpriority1.getState());
        tpriority1.start();
        System.out.println(tpriority1.getState());*/

        ThreadPriorityEx2 tpriority22 = new ThreadPriorityEx2();
        ThreadPriorityEx2 tpriority33 = new ThreadPriorityEx2();
        ThreadPriorityEx2 tpriority44 = new ThreadPriorityEx2();
        tpriority22.setPriority(3);
        tpriority33.setPriority(8);
        tpriority44.setPriority(5);

        System.out.println(tpriority22.getPriority());
        System.out.println(tpriority33.getPriority());
        System.out.println(tpriority44.getPriority());




    }
}
