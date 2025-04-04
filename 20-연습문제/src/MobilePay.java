public class MobilePay implements Payable {
    @Override
    public void pay(int amount) {
        System.out.printf("● 모바일 결제로 %d원 결제합니다.\n", amount);
    }

    public void useBiometrics() {
        System.out.println("● 생체 인증으로 모바일 결제를 시작합니다.");
    }
}
