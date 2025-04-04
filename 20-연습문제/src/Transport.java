public abstract class Transport {
    private String vehicleId;
    private String status;


    public Transport(String vehicleId, String status) {
        this.vehicleId = vehicleId;
        this.status = status;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void stop() {
        this.status = "정지";
        System.out.printf("  교통수단 %s가 정지됩니다.\n", this.vehicleId);
    }

    public abstract void start();

    public abstract void navigate(String destination);

    public abstract void transportStatus();
}
