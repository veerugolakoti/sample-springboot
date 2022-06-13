package MainMethod;

import Collections.*;
import Enumeration.EnumerationEx;
import Enumeration.EnumerationWeekDay;
import FilesOperations.*;
import FilesOperationsChallenge.*;
import MultiThreadeing.MyThread;
import MultiThreadeing.MyThreadExample;

import java.io.IOException;
import java.nio.file.Files;
import java.util.PriorityQueue;

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


        for(int i = 0; i < 10; i++) {
            MyThreadExample threadex = new MyThreadExample();
            threadex.start();
        }
        MyThreadExample threadx = new MyThreadExample();
    }
}
