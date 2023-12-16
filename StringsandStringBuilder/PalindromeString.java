public class ParadomString {
    public static void main(String[] args) {
        String str = "on";
        StringBuilder sb = new StringBuilder(str);
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            if(sb.charAt(front)==sb.charAt(back)){
                count++;
            }
            else if(sb.charAt(front)!=sb.charAt(back)){
                count1++;
            }
        }
        if(count1>=1){
            System.out.println("it is not a palindrome.");
        }
        else if(count1==0){
            System.out.println("it is a palindrome");
        }
    }
}
