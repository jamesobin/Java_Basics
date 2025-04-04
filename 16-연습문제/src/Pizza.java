public class Pizza extends MenuItem {
    public Pizza(String name, int price) {
        super(name, price);
    }

    @Override
    public String addOption() {
        return getName() + "-> 엣지 변경: 치즈 크러스트";
    }

    @Override
    public String toString() {
        return getName() + ": 치즈 듬뿍, 모두의 인기 메뉴";
    }
}
