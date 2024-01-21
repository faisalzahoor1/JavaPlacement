public class SubstringofNatural {
    public static void subset(String str, int idx, String newstr){
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }
        char newchar = str.charAt(idx);
        subset(str, idx+1,newstr+newchar);

        subset(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str = "123";
        subset(str, 0, " ");
    }
}
