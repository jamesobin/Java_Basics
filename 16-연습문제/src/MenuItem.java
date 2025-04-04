public class MenuItem {
    
    private String name;
    private int price;


    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String addOption() {
        return "옵션 추가 기능은 각 음식에 따라 다릅니다.";
    }

    @Override
    public String toString() {
        return "이름:메뉴 설명";
    }
}
