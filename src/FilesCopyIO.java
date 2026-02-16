import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesCopyIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test_io.txt");
        FileOutputStream fos = new FileOutputStream("test_out.txt");
//        byte s[] = fis.readAllBytes();
//        System.out.println(new String(s));
        int i = fis.read();
        while(i!=-1){
            fos.write(i);
            System.out.println((char)i);
            i = fis.read();
        }
//        fos.write(s);
        fis.close();
        fos.close();

    }
}
