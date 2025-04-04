public class Ex06 {
    public static void main(String[] args) {
        Robot[] robot = new Robot[3];
        robot[0] = new DroneBot("드론-01", 80);
        robot[1] = new RescueBot("구조-09", 65);
        robot[2] = new HybridBot("하이브리드-X", 95);

        for(int i = 0; i < robot.length; i++ ){
            robot[i].showStatus();
            robot[i].operate();
            
            if(robot[i] instanceof DroneBot) {
                DroneBot d = (DroneBot) robot[i];
                d.fly();
                d.search();
            } else if(robot[i] instanceof RescueBot) {
                RescueBot r = (RescueBot) robot[i];
                r.rescue();
            } else if(robot[i] instanceof HybridBot) {
                HybridBot h = (HybridBot) robot[i];
                h.fly();
                h.search();
                h.rescue();
            }
        }
    }
}
