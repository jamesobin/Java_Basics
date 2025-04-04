class Dragoon {
    int speed;
    int hp;
    int attack;
    int defense;
}

public class Ex01_DragoonSimulator {
    public static void main(String[] args) {
        /** 1) 클래스로부터 객체 생성하기기 */
        Dragoon dg1 = new Dragoon();

        dg1.speed = 10;
        dg1.hp = 100;
        dg1.attack = 20;
        dg1.defense = 5;

        String tpl = "speed: %d, hp: %d, attack:%d, defense: %d\n";
        System.out.printf(tpl, dg1.speed, dg1.hp, dg1.attack, dg1.defense);

        /** 2) 객체 안에 포함된 값 변경하기 */
        dg1.speed += 1;
        dg1.hp += 10;
        dg1.attack += 2;
        dg1.defense += 1;

        // 공격을 받을 경우 hp가 감소한다.
        dg1.hp -= 10;
        System.out.printf(tpl,dg1.speed, dg1.hp, dg1.attack, dg1.defense);

        /** 3) 클래스의 재사용 */
        // 동일한 속성을 갖는 객체를 추가로 생성할 수 있다.
        // 각 속성은 독립적인 값을 갖는다.
        Dragoon dg2 = new Dragoon();

        dg2.speed = 12;
        dg2.hp = 120;
        dg2.attack = 22;
        dg2.defense = 7;

        System.out.printf(tpl, dg1.speed, dg1.hp, dg1.attack, dg1.defense);
        System.out.printf(tpl, dg2.speed, dg2.hp, dg2.attack, dg2.defense);
    }
}
