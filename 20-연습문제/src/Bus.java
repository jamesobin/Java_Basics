public class Bus extends Transport {
    public Bus(String vehicleId, String status) {
        super(vehicleId, status);
    }

    @Override
    public void start() {
        setStatus("운행 중");
        System.out.printf("● 버스 %s가 출발합니다.\n", this.getVehicleId());
    }
    
    @Override
    public void navigate(String destination) {
        setStatus("운행 중");
        System.out.printf("  버스 %s으로 이동합니다.\n", destination);
    }

    @Override
    public void transportStatus() {
        System.out.printf("  버스 %s 상태: %s\n", this.getVehicleId(), this.getStatus());
    }
}
