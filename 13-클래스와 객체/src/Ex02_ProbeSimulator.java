class Probe {
    void move(int x, int y) {
        System.out.printf("좌표 (%d,%d)로 이동합니다.\n", x, y);
    }
    
    int mineral() {
        System.out.println("광물을 채집합니다.(+10)");
        return 10;
    }

    int gas() {
        System.out.println("가스를 채집합니다.(+5)");
        return 5;
    }
}

public class Ex02_ProbeSimulator {
    public static void main(String[] args) {
        Probe probe1 = new Probe();
        probe1.move(10, 10);

        int my_mineral = 0;
        my_mineral += probe1.mineral();
        my_mineral += probe1.mineral();
        my_mineral += probe1.mineral();

        int my_gas = 0;
        my_gas += probe1.gas();
        my_gas += probe1.gas();

        System.out.printf("채집된 광물: %d, 채집된 가스: %d\n", my_mineral, my_gas);
    }
}
