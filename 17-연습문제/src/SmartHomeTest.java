public class SmartHomeTest {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[3];
        devices[0] = new SmartLight("스마트 전등", false);
        devices[1] = new SmartSpeaker("스마트 스피커", false);
        devices[2] = new SmartThermostat("스마트 온도조절기", false);

        for(int i = 0; i < devices.length; i++) {
            devices[i].turnOn();
        }

        for(int i = 0; i < devices.length; i++) {
            devices[i].showStatus();
        }

        System.out.println();

        SmartLight light = (SmartLight) devices[0];
        light.changeColor("파란색");

        SmartSpeaker speaker = (SmartSpeaker) devices[1];
        speaker.playMusic("Jazz");

        SmartThermostat thermostat = (SmartThermostat) devices[2];
        thermostat.setTemperature(24);
    }
}
