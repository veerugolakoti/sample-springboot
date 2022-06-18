package FilesOperationsChallenge;
import java.io.*;

public class SeqenceStreams {
    SequenceInputStream sequence = null;
    InputStream istream1 = null;
    InputStream istream2 = null;
    public void sequencestream() {
        try {
            istream1=new FileInputStream("Test1.txt");
            istream2=new FileInputStream("Test2.txt");
            FileOutputStream fout=new FileOutputStream("sequenceout.txt");
            SequenceInputStream sis=new SequenceInputStream(istream1,istream2);
            int i;
            while((i=sis.read())!=-1)
            {
                fout.write(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
