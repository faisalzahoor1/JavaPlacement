public class MoileCombination {
    public static String[] Keypad = {".","abc","def","ghi","jklm","nopq","rst","uvw","xyz"};
    public static void Combination(String str, int idx, String strnew){
        if (idx==str.length()) {
            System.out.println("bsc");
            System.out.println(strnew);
            return;
        }
        char curchar = str.charAt(idx);
        String mapping = Keypad[curchar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            System.out.println(i+1);
            System.out.println(idx);
            Combination(str, idx+1, strnew+mapping.charAt(i));
            System.out.println(strnew);
        }
    }
    public static void main(String[] args) {
        String str = "23";
        Combination(str, 0, "");
    }
}
