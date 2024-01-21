public class TilePlace {
    public static int paths(int n, int m){
        if (n==m) {
            return 2;
        }
        if (n<m) {
            return 1;
        }
        int horizontalpath = paths(n-m, m);
        System.out.println("is "+horizontalpath+" horizontalpath");
        int verticalpath = paths(n-1, m);
        System.out.println("is "+verticalpath+" verticalpath");
        return horizontalpath + verticalpath;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        int totalpaths = paths(n,m);
        System.out.println(totalpaths);
    }
}
