public class Ex06_호출스택 {
    public static void main(String[] args) {
        System.out.println("--- main 시작 ---");
        int a = 10;
        int b = f2(a);

        System.out.printf("f2(%d) = %d\n", a, b);
        System.out.println("--- main 종료 ---");
    }

    public static int f1(int x1) {
        System.out.println("--- f1 시작 ---");
        System.out.printf("f1(%d) = %d + 1\n", x1, x1);
        System.out.println("--- f1 종료 ---");
        return x1 + 1;
    }

    public static int f2(int x2) {
        System.out.println("--- f2 시작 ---");
        System.out.printf("f2(%d) = f1(%d) * 2\n", x2, x2);
        int y = f1(x2) * 2;
        System.out.println("--- f2 종료 ---");
        return y;
    }
}
