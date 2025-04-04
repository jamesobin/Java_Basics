public class Ex03 {
    public static void main(String[] args) {
        Transport[] transport = new Transport[3];
        transport[0] = new Bus("BUS-001", "대기");
        transport[1] = new Train("TR-202", "대기");
        transport[2] = new Drone("DRN-A7", "대기");

        for(int i = 0; i < transport.length; i++) {
            transport[i].start();
            transport[i].navigate("서울역");
            transport[i].transportStatus();
            transport[i].stop();
            transport[i].transportStatus();

            if(transport[i] instanceof Train) {
                Train t = (Train) transport[i];
                t.announceStations();
            }
            if(transport[i] instanceof Drone) {
                Drone d = (Drone) transport[i];
                d.captureSurroundings();
            }

            System.out.println();
        }
    }
}
