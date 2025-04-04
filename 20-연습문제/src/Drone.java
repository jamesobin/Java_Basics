public class Drone extends Transport {
    public Drone(String vehicleId, String status) {
        super(vehicleId, status);
    }

    @Override
    public void start() {
        setStatus("운행 중");
        System.out.printf("● 드론 %s가 이륙합니다.\n", this.getVehicleId());
    }
    
    @Override
    public void navigate(String destination) {
        setStatus("운행 중");
        System.out.printf("  드론이 항공 경로를 따라 %s으로 이동합니다.\n", destination);
    }

    public void captureSurroundings() {
        System.out.println("  드론이 주변 상황을 촬영합니다.");
    }

    @Override
    public void transportStatus() {
        System.out.printf("  드론 %s 상태: %s\n", this.getVehicleId(), this.getStatus());
    }
}
