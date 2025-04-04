public class Ex02_객체형변환 {
    public static void main(String[] args) {
        Protoss p0 = new Protoss("프로브1호", 50, 30, 20);

        // 1) 자식 객체로 생성 후 부모 형식의 객체에 참조
        Zilot z = new Zilot("질럿1호", 300, 150, 120);
        Protoss p1 = z;

        // 2) 선언은 부모 형식, 할당은 자식 형식
        Protoss p2 = new Dragun("드라군1호", 280, 120, 170);

        // 부모 객체로 변환되더라도 자식 클래스가 Override 한 기능은 자식의 기능을 그대로 유지된다.
        p0.move("저그 본진");
        p0.attack("저그 본진");
        System.out.println("-----");

        p1.move("저그 본진");
        p1.attack("저그 본진");
        System.out.println("-----");
        
        p2.move("저그 본진");
        p2.attack("저그 본진");
        System.out.println("-----");

        // 부모 형태로 변환된 객체를 다시 자식 형태로 역변환하면 잠긴 기능이 해제된다.
        Zilot rz = (Zilot) p1;
        Dragun rd = (Dragun) p2;
        rz.swardAttack("저그 본진");
        rd.fireAttack("저그 본진");
    }
}
