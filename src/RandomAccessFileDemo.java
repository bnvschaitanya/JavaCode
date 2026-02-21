import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.Scanner;
import java.io.*;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("test_out.txt", "rw");
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.write('#');
        System.out.println((char)raf.read());
        raf.seek(1);
        raf.seek(raf.getFilePointer()+2);
        System.out.println((char)raf.read());
    }
}
