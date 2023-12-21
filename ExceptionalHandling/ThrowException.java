import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age<18) {
            throw new YoungAgeException(" You are under age.");
        }
        else{
            System.out.println("You are eligible for voting.");
        }
        } catch (YoungAgeException e) {
            e.printStackTrace();
        }
        
        System.out.println("hello everyone.");
    }
}

class YoungAgeException extends RuntimeException{
    YoungAgeException(String msg){
        super(msg);
    }
}
