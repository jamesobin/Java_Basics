public class Ex04 {
    public static void main(String[] args) {
        Cleanable[] robot = new Cleanable[2];
        robot[0] = new VacuumRobot();
        robot[1] = new MopRobot();

        for(int i = 0; i < robot.length; i++) {
            robot[i].startCleaning();
            robot[i].stopCleaning();
        }
    }
}
