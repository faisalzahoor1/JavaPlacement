import java.util.Scanner;

public class FrstndLstInd {
    public static int first = -1;
    public static int last = -1;
    public static void Index(String str, int ind, Character element){
        if (ind==str.length()) {
            System.out.println(first+" and "+last);
            return;
        }
        if (str.charAt(ind)==element) {
            if (first==-1) {
                first = ind;
            }else{
                last = ind;
        }
        }
        Index(str, ind+1, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int ind = 0;
        char element = 'a';
        Index(str,ind, element);
    }
}
