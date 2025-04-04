public class Cash implements Payable {
    @Override
    public void pay(int amount) {
        System.out.printf("● 현금으로 %d원 결제합니다.\n", amount);
    }
}
