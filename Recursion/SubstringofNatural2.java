import java.util.ArrayList;

public class SubstringofNatural2 {
    public static void printlist(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
    public static void subset(int n, ArrayList<Integer> list){
        if (n==0) {
            printlist(list);
            return;
        }
        list.add(n);
        subset(n-1, list);

        list.remove(list.size()-1);
        subset(n-1, list);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        subset(n,list);
    }
}
