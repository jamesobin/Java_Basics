public class SmartLight extends SmartDevice {
    public SmartLight(String name, boolean isOn) {
        super(name, isOn);
    }

    public void changeColor(String color) {
        if(this.getIsOn()) {
            System.out.println("스마트 전등 조명이 " + color + "으로 바뀝니다.");
        } else {
            System.out.println(this.getName() + "이 꺼져 있어 색상을 변경할 수 없습니다.");
        }
    }
}
