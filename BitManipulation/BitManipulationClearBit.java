public class BitManipulationClearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;

        int bitMask = 1 << pos;
        int newnumber = ~(bitMask) & n;
        System.out.println(newnumber);

    }
}
