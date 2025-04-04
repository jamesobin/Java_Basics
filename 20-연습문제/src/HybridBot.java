public class HybridBot extends Robot implements Flyable, Searchable, Rescuable {
    public HybridBot(String name, int batteryLevel) {
        super(name, batteryLevel);
    }

    @Override
    public void operate() {
        System.out.println("  하이브리드봇이 다기능 모드로 작동합니다.");
    }

    @Override
    public void fly() {
        System.out.println("  드론이 비행합니다.");
    }

    @Override
    public void search() {
        System.out.println("  드론이 수색 작업을 수행합니다.");
    }

    @Override
    public void rescue() {
        System.out.println("  구조 임무를 수행합니다.");
    }    
}
