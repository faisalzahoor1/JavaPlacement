import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class filehandling1 {
    public static void main(String[] args) {

        // Creating a file.
        File myFile = new File("CWHFILE.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing in a file.
        try {
            FileWriter fileWriter = new FileWriter("CWHFILE.txt");
            fileWriter.write("This is our first file handling code.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Reading a file.
        // try {
        //     File myFile1 = new File("CWHFILE.txt");
        //     Scanner sc = new Scanner(myFile);
        //     while (sc.hasNextLine()) {
        //         String text = sc.nextLine();
        //         System.out.println(text);
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        // Deleting a file.
    //     File mFile = new File("CWHFILE.txt");
    //     if (mFile.delete()) {
    //         System.out.println("You deleted the file.");
    //     }
    //     else{
    //         System.out.println("Their is some error due to which your file not deleted.");
    //     }
    }
}
