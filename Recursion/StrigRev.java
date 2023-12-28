import java.util.Scanner;

public class StrigRev {
    public static void Revstr(String str, int ind){
        if (ind==0) {
            System.out.print(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        Revstr(str, ind-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int ind = str.length()-1;
        Revstr(str, ind);
    }
}
