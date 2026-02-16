import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamInput {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("test_io.txt");
            String s = "Learning Java Programming";
            byte[] b = s.getBytes();
            for(byte bb : b){
                fos.write(bb);
            }
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}
