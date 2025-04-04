public class Ex04_DoubleFor {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            System.out.println("i에 대한 반복 수행 시작 >> i=" + i);

            for(int j = 0; j < 5; j++) {
                System.out.printf("\ti=%d, j=%d\n", i, j);
            }

            System.out.println("i에 대한 반복 수행 종료 >> i=" + i);
        }
    }
}
