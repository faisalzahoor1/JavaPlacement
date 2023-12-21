public class ThrowsException {
    public static void div()throws ArithmeticException{
        int a = 100, b = 0, c;
        c = a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        try {
            div();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
