import java.io.FileInputStream;

public class ByteStreamOutput {
    public static void main(String args[]) throws Exception{
        FileInputStream fis = new FileInputStream("test_io.txt");
        while(fis.available()>0){
            fis.read();
            System.out.println((char)fis.read());
        }
    }
}
