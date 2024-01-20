import java.util.HashSet;

public class Repeatedsubseq {
        
    public static void subseq(String str, int ind, String newstr, HashSet<String> set){
        if (ind == str.length()) {
            if (set.contains(newstr)) {
                return;
            }else{
                set.add(newstr);
                System.out.println(newstr);
                return;
            }
        }
        char curchar = str.charAt(ind);
        subseq(str, ind+1, newstr+curchar, set);

        subseq(str, ind+1, newstr,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subseq(str,0,"",set);
    }
}
