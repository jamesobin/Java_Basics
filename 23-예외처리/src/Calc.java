public class Calc {
    /** 싱글톤 패턴 */
    private static Calc current;

    public static Calc getInstance() {
        if(current == null) {
            current = new Calc();
        }

        return current;
    }

    private Calc() {
        super();
    }

    // 런타임 에러가 발생할 가능성이 있는 메서드 안에서 직접 try-catch를 사용
    public int divied(int x, int y) {
        int z = 0;

        try {
            z = x / y;
        } catch(Exception e) {
            System.out.println("[divied 에러] 0으로 나눌 수 없습니다.");
        }

        return z;
    }

    // 메서드를 선언하면서 그 안에서 발생 가능성이 있는 에러 상황을 throws 처리하면
    // 해당 에러가 발생했을 때 이 메서드를 호출한 지점으로 예외처리 책임을 떠넘긴다.
    public int diviedEx(int x, int y) throws Exception {
        return x / y;
    }
}
