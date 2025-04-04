public class Salad extends MenuItem {
    public Salad(String name, int price) {
        super(name, price);
    }

    @Override
    public String addOption() {
        return getName() + "-> 드레싱 선택: 발사믹";
    }

    @Override
    public String toString() {
        return getName() + ": 신선한 채소로 만든 건강식";
    }
}
