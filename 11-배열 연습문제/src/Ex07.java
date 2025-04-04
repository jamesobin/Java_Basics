public class Ex07 {
    public static void main(String[] args) {
        int[] price = {38000, 20000, 17900, 17900};
        int[] qty = {6, 4, 3, 5};
        int max = 0;

        for(int i = 0; i < price.length; i++) {
            if(price[i] * qty[i] > max) {
                max = price[i] * qty[i];
            }
        }

        System.out.println("가장 높은 상품금액: " + max + "원");
    }
}
