public class Train extends Transport {
    public Train(String vehicleId, String status) {
        super(vehicleId, status);
    }

    @Override
    public void start() {
        setStatus("운행 중");
        System.out.printf("● 기차 %s가 플랫폼을 떠납니다.\n", this.getVehicleId());
    }
    
    @Override
    public void navigate(String destination) {
        setStatus("운행 중");
        System.out.printf("  기차 %s행 노선으로 진입합니다.\n", destination);
    }

    public void announceStations() {
        System.out.println("  기차가 다음 역들을 안내합니다...");
    }

    @Override
    public void transportStatus() {
        System.out.printf("  기차 %s 상태: %s\n", this.getVehicleId(), this.getStatus());
    }
}
