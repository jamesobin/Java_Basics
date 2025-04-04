public class RescueBot extends Robot implements Rescuable {
    public RescueBot(String name, int batteryLevel) {
        super(name, batteryLevel);
    }

    @Override
    public void operate() {
        System.out.println("  구조봇이 현장에 투입됩니다.");
    }

    @Override
    public void rescue() {
        System.out.println("  구조 임무를 수행합니다.");
    }
}
