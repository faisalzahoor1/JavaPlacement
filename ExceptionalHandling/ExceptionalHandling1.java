import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] val = new int[10];
        int a = 0;
        while (a < 10) {
            try {
                val[a] = sc.nextInt();
                a++;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid input.");
                System.out.println(e);
            }
        }
        while (true) {
            try {
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                System.out.print("Enter the index: ");
                int index = sc.nextInt();
                if (val[index] == num) {
                    System.out.println("You won.");
                    break;
                } else {
                    System.out.println("You lose.");
                    break;
                }
                
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Enter valid input.");
                System.out.println(e);
            } catch (InputMismatchException e) {
                System.out.println("Enter valid input.");
                System.out.println(e);
            }
        }
    }
}
