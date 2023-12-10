import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WithoutException {
    public static void main(String[] args) {
        // These are runtime exceptions.And this unchecked exception.

        int a = 10, b = 0, c;
        c = a / b;
        System.out.println(c);

        // These are compile time exceptions.Here it gives unreported exception that
        // filenotfound and there wil be issue in future while compiling this code so
        // for reporting we use try and catch to hanle exception manually. And this is
        // checked exception.

        FileInputStream fis = new FileInputStream("d:/abc.txt");

    }
}
