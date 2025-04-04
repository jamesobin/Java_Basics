public class Dragun extends Protoss {
    public Dragun(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
    }

    @Override
    public void attack(String target) {
        // super는 부모 클래스를 의미함
        // --> super.메서드이름()은 재정의 되기 이전 부모가 갖는 원본을 의미
        super.attack(target);
        // 부모가 갖는 원본을 실행한 후 추가적인 내용을 보완 할 수 있다.
        System.out.println(">>>>> 원거리 공격을 위한 포탄 발사~!!!");
    }

    @Override
    public void move(String position) {
        super.move(position);
        System.out.println(">>>>> 지정된 위치까지 지상으로 이동~!!!");
    }

    /**
     * 이 클래스가 독자적으로 갖는 고유의 기능
     * @param target 공격할 대상
     */
    public void fireAttack(String target) {
        // 멤버변수는 부모 클래스가 갖고 있지만 private이르모 상속되지 않는다.
        // 멤버변수에 접근하기 위해서는 getter, setter를 통해 간접적으로 접근해야 한다.
        System.out.printf("[드라군의 고유 스킬] %s가 %s에게 포탄을 발사합니다.", this.getName(), target);
    }
}
