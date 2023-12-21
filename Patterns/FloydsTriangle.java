public class FloydsTriangle {
    public static void main(String[] args) {
        int je=1;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(je+" ");
                je++;
            }
            System.out.println();
        }
    }
}
