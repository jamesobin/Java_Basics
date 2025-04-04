public class Ex08 {
    public static void main(String[] args) {
        int[] price = {38000, 20000, 17900, 17900};
        int[] qty = {6, 4, 3, 5};
        int count = 0;

        for(int i = 0; i < price.length; i++) {
            if(price[i] * qty[i] >= 80000) {
                count++;
            }
        }

        System.out.println("무료배송 항목: " + count + "건");
    }
}
