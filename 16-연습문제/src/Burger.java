public class Burger extends MenuItem {
    public Burger(String name, int price) {
        super(name, price);
    }

    @Override
    public String addOption() {
        return getName() + "-> 치즈 추가";
    }

    @Override
    public String toString() {
        return getName() + ": 패티와 빵이 조화를 이루는 메뉴";
    }
}
