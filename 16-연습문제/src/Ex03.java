public class Ex03 {
    
    public static void main(String[] args) {   
        MenuItem[] m = new MenuItem[3];

        m[0] = new Burger("치즈버거", 5000);
        m[1] = new Pizza("페퍼로니 피자", 10000);
        m[2] = new Salad("그린 샐러드", 4000);

        int totalPrice = 0;
        for(int i = 0; i < m.length; i++) {
            totalPrice += m[i].getPrice();

            System.out.println(m[i].toString());
        }

        System.out.println("총 가격: " + totalPrice + "원");
        System.out.println("옵션 적용:");

        for(int i = 0; i < m.length; i++) {
            System.out.println("\t" + m[i].addOption());
        }
    }

}
