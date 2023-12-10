import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exception {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            // 1.here sop(e) can only print exception name and description but not (stack
            // trace)
            // System.out.println(e);

            // 2.here e.printStackTrace() can print exception name, description, and also
            // stack trace
            // e.printStackTrace();

            // 3.here e.toString() can print only give description
            // e.toString();

            // 4.here e.getMessage() can print only give description
            // e.getMessage();

            // 5.here e.getMessage() can print only give description
            // e.getMessage();
        }
        System.out.println("hello everyone");

        // These are runtime exceptions.And this unchecked exception.
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("hello everyone");

        // These are compile time exceptions.Here it gives unreported exception that
        // filenotfound and there wil be issue in future while compiling this code so
        // for reporting we use try and catch to hanle exception manually. And this is
        // checked exception.
        try {
            FileInputStream fis = new FileInputStream("d:/abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("hello everyone");
    }
}
