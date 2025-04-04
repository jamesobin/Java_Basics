public class Ex04_SingleTonPattern {
    public static void main(String[] args) {
        int x = 100;
        int y = 50;

        // // 일반 클래스의 경우 객체 생성에 아무런 제약이 없기 때문에
        // // 각각의 메서드를 호출할 때마다 새로운 객체를 생성할 수 있다.
        // // --> 메모리 낭비
        // Calc c1 = new Calc();
        // System.out.printf("%d + %d = %d\n", x, y, c1.plus(x, y));

        // Calc c2 = new Calc();
        // System.out.printf("%d - %d = %d\n", x, y, c1.minus(x, y));

        // Calc c3 = new Calc();
        // System.out.printf("%d * %d = %d\n", x, y, c1.times(x, y));

        // Calc c4 = new Calc();
        // System.out.printf("%d / %d = %d\n", x, y, c1.divied(x, y));

        // // 위와 같은 방법은 하나의 객체를 통해 메서드를 4번 호출하는 것보다 불필요한 메모리 소비가 더 많다.
        // // --> 아래와 같이 처리하는 것이 메모리 절약에 효율적
        // Calc c5 = new Calc();
        // System.out.printf("%d + %d = %d\n", x, y, c5.plus(x, y));
        // System.out.printf("%d - %d = %d\n", x, y, c5.minus(x, y));
        // System.out.printf("%d * %d = %d\n", x, y, c5.times(x, y));
        // System.out.printf("%d / %d = %d\n", x, y, c5.divied(x, y));
        // System.out.println("----------------");

        /** 싱글톤 객체를 생성하여 활용하기 */
        // 1) 생성자가 은닉되어 있으므로 new 키워드의 사용은 금지되었다.
        // --> 아래 코드는 에러
        // CalcSingleTon cs = new CalcSingleTon();

        // 2) 객체는 반드시 getInstance() 메서드를 통해서 반환받아야 함
        // CalcSingleTon 클래스 안에서 공유 자원(static)으로 객체를 선언하고,
        // null인 경우에만 할당하고 있으므로 단 1회만 객체를 생성하고
        // 생성된 객체를 getInstance() 메서드를 통해 돌려 사용한다.
        CalcSingleTon cs1 = CalcSingleTon.getInstance();
        System.out.printf("%d + %d = %d\n", x, y, cs1.plus(x, y));

        CalcSingleTon cs2 = CalcSingleTon.getInstance();
        System.out.printf("%d - %d = %d\n", x, y, cs2.minus(x, y));

        CalcSingleTon cs3 = CalcSingleTon.getInstance();
        System.out.printf("%d * %d = %d\n", x, y, cs3.times(x, y));

        CalcSingleTon cs4 = CalcSingleTon.getInstance();
        System.out.printf("%d / %d = %d\n", x, y, cs4.divied(x, y));
    }
}
