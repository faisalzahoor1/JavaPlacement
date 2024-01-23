import java.util.Scanner;
public class Powerof2usingBitwise {
    public static boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num1 = sc.nextInt();  
         

        System.out.println(num1 + " is a power of 2: " + isPowerOfTwo(num1));
    }
}
