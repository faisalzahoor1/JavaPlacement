public class MoveallX {
    public static void Moveallx(String str , int ind, int count, String newstr){
        if (ind==str.length()-1) {
            for (int i = 0; i < count; i++) {
                newstr += "x";
            }
            System.out.println(newstr);
            return;
        }
        char newchar = 'x';
        if (str.charAt(ind)==newchar) {
            count++;
            Moveallx(str, ind+1, count, newstr);
        }else{
            newstr += str.charAt(ind);
            Moveallx(str, ind+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        int count = 0;
        int ind = 0;
        String str = "abxdexxdex";
        String newstr = " ";
        Moveallx(str, ind, count, newstr);
    }
}
