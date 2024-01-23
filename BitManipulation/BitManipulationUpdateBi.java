import java.util.Scanner;

public class BitManipulationUpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        if (operation == 1) {
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        } else {
            int newnumber = ~(bitMask) & n;
            System.out.println(newnumber);
        }
    }
}
