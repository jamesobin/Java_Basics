public class DroneBot extends Robot implements Flyable, Searchable {
    public DroneBot(String name, int batteryLevel) {
        super(name, batteryLevel);
    }

    @Override
    public void operate() {
        System.out.println("  드론봇이 공중에서 임무를 시작합니다.");
    }

    @Override
    public void fly() {
        System.out.println("  드론이 비행합니다.");
    }

    @Override
    public void search() {
        System.out.println("  드론이 수색 작업을 수행합니다.");
    }    
}
