public class DuplicateString {
    public static boolean[] map = new boolean[26];
    
    public static void DuplicateStrrings(String str, int ind, String newstr){
        if (ind == str.length()) {
            System.out.print(newstr);
            return;
        }
        char curchar = str.charAt(ind);
        if (map[curchar-'a']== true) {
            DuplicateStrrings(str, ind+1, newstr);
        }else{
            newstr += curchar;
            map[curchar-'a'] = true;
            DuplicateStrrings(str, ind+1, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "aabbacdefsghhjhjs";
        DuplicateStrrings(str, 0, " ");
    }
}
