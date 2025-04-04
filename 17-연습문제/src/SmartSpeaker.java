public class SmartSpeaker extends SmartDevice {
    public SmartSpeaker(String name, boolean isOn) {
        super(name, isOn);
    }

    public void playMusic(String song) {
        if(this.getIsOn()) {
            System.out.println("스마트 스피커에서 \'" + song + "\' 음악을 재생합니다.");
        } else {
            System.out.println(this.getName() + "이 꺼져 있어 노래를 재생할 수 없습니다.");
        }
    }
}
