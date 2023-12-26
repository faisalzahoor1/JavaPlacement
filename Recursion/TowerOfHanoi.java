public class TowerOfHanoi {
    public static void Hanoi(int n, String src, String hlp, String dest){
        if(n==1){
            System.out.println("Disk "+ n +" transfer from "+src+" to "+ dest);
            return;
        }
        Hanoi(n-1, src, dest, hlp);
        System.out.println("Disk "+ n +" transfer from "+src+" to "+ dest);
        Hanoi(n-1,hlp,src,dest);
    }
    public static void main(String[] args) {
        int n=2;
        Hanoi(n,"S","H","D");
    }
}
