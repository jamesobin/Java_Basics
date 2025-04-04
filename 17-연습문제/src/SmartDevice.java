public class SmartDevice {
    private String name;
    private boolean isOn;


    public SmartDevice(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsOn() {
        return this.isOn;
    }
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    // 출력을 하라고 했으므로 문자열 반환보다 바로 출력하는 코드로 작성

    public void turnOn() {
        this.isOn = true;
        System.out.printf("%s(이)가 켜졌습니다.\n", this.name);
    } 
    
    public void turnOff() {
        this.isOn = false;
        System.out.printf("%s(이)가 꺼졌습니다.\n", this.name);
    }

    public void showStatus() {
        String status = null;

        if(this.isOn) {
            status = "ON";
        } else {
            status = "OFF";
        }

        System.out.printf("%s 상태: %s\n", this.name, status);
    }
}
