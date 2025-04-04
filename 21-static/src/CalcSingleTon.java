public class CalcSingleTon {
    /** 은닉된 형태로 자기 자신에 대한 객체를 static 멤버변수를 선언 */
    // --> static은 공유 자원이므로 이 클래스의 객체가 몇 개가 생성되더라도 단 하나만 존재하게 됨
    private static CalcSingleTon current;

    /** 불필요한 객체 생성 없이 static 객체를 할당하기 위한 static 메서드 생성 */
    public static CalcSingleTon getInstance() {
        if(current == null) {
            current = new CalcSingleTon();
        }
        return current;
    }

    /** 외부에서 new 키워드를 통한 객체 생성을 금지하기 위해 생성자를 은닉 */
    // 같은 클래스 안에서는 호출 가능하므로 이 소스 안에서 new를 사용하는 것은 허용됨
    // --> 10라인
    private CalcSingleTon() {
        System.out.println("CalcSingleTon에 대한 current 객체가 생성됨");
    }

    /*** 이하 이 클래스의 객체가 포함해야 할 일반 메서드 ***/
    public int plus(int x, int y) {
        return x + y;
    }
    public int minus(int x, int y) {
        return x - y;
    }
    public int times(int x, int y) {
        return x * y;
    }
    public int divied(int x, int y) {
        return x / y;
    }
}
