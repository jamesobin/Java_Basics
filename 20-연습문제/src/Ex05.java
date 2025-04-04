public class Ex05 {
    public static void main(String[] args) {
        Payable[] pay = new Payable[3];
        pay[0] = new CreditCard();
        pay[1] = new Cash();
        pay[2] = new MobilePay();

        for(int i = 0; i < pay.length; i++) {
            pay[i].pay(10000);
        }
        MobilePay mobilePay = (MobilePay) pay[2];
        mobilePay.useBiometrics();
    }
}
