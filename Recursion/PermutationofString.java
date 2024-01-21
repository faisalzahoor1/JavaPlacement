public class PermutationofString {

    public static void permute(String str, String Permutation){
        if (str.length()==0) {
            System.out.println("permutated string is "+Permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str+" and "+Permutation);
            //System.out.println(i);
            char newchar = str.charAt(i);
            //System.out.println("new char is "+newchar);
            String newstr = str.substring(0, i)+str.substring(i+1);
           //System.out.println("new string is "+newstr);
            permute(newstr, Permutation+newchar);
            //System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }
}
