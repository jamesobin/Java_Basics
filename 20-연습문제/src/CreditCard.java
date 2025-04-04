public class CreditCard implements Payable {
    @Override
    public void pay(int amount) {
        System.out.printf("● 신용카드로 %d원 결제합니다.\n", amount);
    }
}
