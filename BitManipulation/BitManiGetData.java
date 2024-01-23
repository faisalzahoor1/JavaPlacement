public class BitManiGetData {

    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        if ((n & bitMask) == 0) {
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is one.");
        }
    }
}
