import java.util.*;

public class FirstLastOccurence {
    public static int Firstindx = -1;
    public static int lastindx = -1;

    public static void occr(String str, int indx) {
        char str1 = 'a';
        if (indx == str.length()) {
            System.out.println("first index is " + Firstindx + " and last index is " + lastindx);
            return;
        }
        if (str.charAt(indx) == str1) {
            if (Firstindx == -1) {
                Firstindx = indx;
            } else {
                lastindx = indx;
            }
        }
        occr(str, indx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aabbbbbbcdeaaba";
        int indx = 0;
        occr(str, indx);
    }
}
