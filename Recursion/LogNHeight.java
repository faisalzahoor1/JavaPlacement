public class LogNHeight {
    public static int PowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return PowerN(x, n / 2) * PowerN(x, n / 2);
        } else {
            return PowerN(x, n / 2) * PowerN(x, n / 2) * x;

        }
    }

    public static void main(String[] args) {
        int x = 2, n = 4;
        int ans = PowerN(x, n);
        System.out.println(ans);
    }
}
