import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        //print list
        
        System.out.println(" print list ");
        for (int i = 0; i < 1; i++) {
            System.out.println(list);
        }

        //size operation

        System.out.println(" size of list " + list.size());

        //sort operation
        System.out.println(" sorting ");
        Collections.sort(list);
        for (int i = 0; i < 1; i++) {
            System.out.println(list);
        }

        //get operation
        System.out.println(" get operation ");
        System.out.println(list.get(1));
        for (int i = 0; i < 1; i++) {
            System.out.println(list);
        }

        //set operation
        System.out.println(" set operation ");
        int c = list.set(1, 6);
        for (int i = 0; i < 1; i++) {
            System.out.println(list);
        }

        //delete operation
        System.out.println(" dlete operation ");
        int d = list.remove(1);
        for (int i = 0; i < 1; i++) {
            System.out.println(list);
        }

    }
}
