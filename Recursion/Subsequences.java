public class Subsequences {
    public static void subseq(String str, int ind, String newstr){
        if (ind == str.length()) {
            System.out.println(newstr);
            return;
        }
        char curchar = str.charAt(ind);
        subseq(str, ind+1, newstr+curchar);

        subseq(str, ind+1, newstr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subseq(str,0,"");
    }
}
