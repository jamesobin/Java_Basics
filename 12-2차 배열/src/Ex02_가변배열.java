public class Ex02_가변배열 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {100, 200};

        int[][] foo = {a, b};

        System.out.println(foo[0][0]);
        System.out.println(foo[0][1]);
        System.out.println(foo[0][2]);
        System.out.println(foo[1][0]);
        System.out.println(foo[1][1]);
        System.out.println("--------------");

        int[][] bar = new int[][] {{1, 2, 3, 4}, {10, 20}};
        System.out.println(bar[0][0]);
        System.out.println(bar[0][1]);
        System.out.println(bar[0][2]);
        System.out.println(bar[0][3]);
        System.out.println(bar[1][0]);
        System.out.println(bar[1][1]);
    }
}
