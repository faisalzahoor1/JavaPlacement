public class Count1 {
    public static void main(String[] args) {
        int count = 0, count1 = 0, n=5;
        for (int i = 0; i < 4; i++) {
            int pos = i;
            int bitMask = 1 << pos;

            if ((n & bitMask) == 0) {
                //System.out.println("bit is zero");
                count++;
            } else {
                //System.out.println("bit is one.");
                count1++;
            }
        }
        System.out.println("1's present in "+ n +" is "+count);

    }
}
