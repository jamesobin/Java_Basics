public abstract class Robot {
    private String name;
    private int batteryLevel;

    public Robot(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void showStatus() {
        System.out.printf("● 로봇명 : %s, 배터리: %d%%\n", this.name, this.batteryLevel);
    }

    public abstract void operate();
}
