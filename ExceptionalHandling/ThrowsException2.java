import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ThrowsException2 {
    public static void main(String[] args) {
        test obj = new test();
        try {
            obj.readfile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            obj.savefile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
class test{
    void readfile()throws FileNotFoundException{
        FileInputStream fil = new FileInputStream("d:/firstcopy.pptx");
    }
    void savefile()throws FileNotFoundException{
        String str = "hello faisal";
        FileOutputStream fil = new FileOutputStream("d:/xyz.txt");
    }
}
