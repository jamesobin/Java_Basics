public class Ex05_VultureSimulator {
    public static void main(String[] args) {
        Vulture v1 = new Vulture("벌처1", 100);
        Vulture v2 = new Vulture("벌처2", 100);

        v1.state();
        v2.state();

        v1.attacked(30);
        v2.attacked(20);

        v1.state();
        v2.state();

        v1.levelup();
        v2.levelup();

        v1.state();
        v2.state();
    }
}
