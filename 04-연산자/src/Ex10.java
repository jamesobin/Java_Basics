public class Ex10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a > b ? 1 : 2;
        System.out.println(c);

        boolean k = true;
        int r = k ? 100 : 0;
        int s = !k ? 100 : 0;
        System.out.printf("r=%d, s=%d\n", r, s);

        int x = 10;
        int y = 20;
        int z = x > y ? x + y : x - y;
        System.out.printf("z=%d\n", z);
    }
}
