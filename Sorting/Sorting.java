import java.util.Scanner;

public class qs5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int greatest = 0 ;
        //int min = 0;
        //int m = n-1;
        int[] name = new int[n];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextInt();
        }
        
        for (int i = 1; i <= name.length-1; i++) {
            for (int j = 0; j < name.length; j++) {
                if(name[i] >  name[j] ){
                    int temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
            
        }
        for (int j = 0; j < name.length; j++) {
            System.out.println(name[j]);
        }
        
    }
} 
