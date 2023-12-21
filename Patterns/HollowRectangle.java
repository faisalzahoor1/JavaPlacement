import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0 || i==4) {
                    System.out.print("*"+" ");
                }
                else if(j==0 || j==4 && i>=1 ){
                    System.out.print("*"+"    ");
                }
                else if (j>=1 && j<=3 && i>=1 && i<=3) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
