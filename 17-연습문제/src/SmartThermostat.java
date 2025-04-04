public class SmartThermostat extends SmartDevice {
    public SmartThermostat(String name, boolean isOn) {
        super(name, isOn);
    }

    public void setTemperature(int degree) {
        if(this.getIsOn()) {
            System.out.println("스마트 온도조절기의 온도를 " + degree + "도로 설정합니다.");
        } else {
            System.out.println(this.getName() + "이 꺼져 있어 온도를 조절할 수 없습니다.");
        }
    }
}
