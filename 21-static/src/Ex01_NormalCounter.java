class NormalCounter {
    // 일반 멤버변수 --> 객체마다 독립적으로 보유하고 있다.
    private int count = 0;

    public NormalCounter() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Ex01_NormalCounter {
    public static void main(String[] args) {
        // 객체 생성
        // --> c1.counter 변수와 c2.counter 변수는 각각 독립적인 데이터이다.
        NormalCounter c1 = new NormalCounter();
        NormalCounter c2 = new NormalCounter();

        // 생성자에 의해서 1 증가한 count 변수는 c1과 c2에 각각 고유하게 존재하므로
        // 두 객체의 값은 서로 구분된다. --> 각각 1이 되어 있음
        System.out.printf("c1의 count: %d\n", c1.getCount());
        System.out.printf("c2의 count: %d\n", c2.getCount());
    }
}