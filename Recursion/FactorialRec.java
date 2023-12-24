public class FactorailRec {

    public static void fact(int n, int ft) {
        if (n == 0) {
            System.out.println("Factorial of " + n + "! is " + " 1 ");
            return;
        }
        if (n==1) {
            System.out.print(n);
            System.out.print(" = "+ ft);
            return;
        }
        if (n > 1) {
            System.out.print(n+" x ");
            fact(n - 1, ft * (n - 1));
            return;
        }
        
    }

    public static void main(String[] args) {
        int n = 1;
        int ft = n;
        fact(n, ft);
    }
}
