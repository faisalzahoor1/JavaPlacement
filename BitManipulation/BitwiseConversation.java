import java.util.Scanner;

public class BitwiseConversation {
    public static void main(String[] args) {
        // Binary to Decimal.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String Binary = sc.nextLine();
        int decimal = Integer.parseInt(Binary, 2);
        System.out.println(decimal+" is a Decimal number.");

        // Decimal to Binary.
        System.out.print("Enter Decimal number: ");
        int decimalnum = sc.nextInt();
        String Binarynum = Integer.toBinaryString(decimalnum);
        System.out.println(Binarynum+" is a Binary number.");
    }
}
