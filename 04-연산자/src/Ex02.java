public class Ex02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.printf("before : a=%d, b=%d\n", a, b);

        int c;
        c = a;
        a = b;
        b = c;

        System.out.printf("after : a=%d, b=%d\n", a, b);
    }
}
