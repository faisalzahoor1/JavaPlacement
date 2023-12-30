import java.util.Scanner;


public class StringInput {
    public static void Rec(String str, int i){
        if (i==3) {
            return;
        }
        Rec(str, i+1);
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int i =0;
        Rec(str, i);
        
    }
}
