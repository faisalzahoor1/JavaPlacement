public class XToPowerN {
    public static int PowerN(int x, int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int powerx = PowerN(x, n-1);
        int pow = x*powerx;
        return pow;
    }
    public static void main(String[] args) {
        int x = 2, n = 4;
        int ans = PowerN(x,n);
        System.out.println(ans);
    }
}
