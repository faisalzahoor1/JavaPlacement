public class NaturalNumbersSum {
    public static void Naturalnum(int i, int n, int sum){
        if (i==n) {
            sum +=i;
            System.out.println(sum);
           return; 
        }
        sum += i;
        Naturalnum(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int  sum = 0, i =1;
        int n = 10;
        Naturalnum(i,n, sum);
        
    }
}
