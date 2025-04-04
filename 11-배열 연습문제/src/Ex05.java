public class Ex05 {
    public static void main(String[] args) {
        int[] workTime = {7, 5, 5, 5, 5, 10, 7};

        int pay = 0;

        for(int i = 0; i < 4; i++) {
            pay += (workTime[i] * 4500);
        }
        for(int i = 4; i < workTime.length; i++) {
            pay += (workTime[i] * 5200);
        }

        // for(int i = 0; i < workTime.length; i++) {
        //     pay += workTime[i] * (i < 4 ? 4500:5200);
        // }

        System.out.println("일주일 간의 총 급여: " + pay + "원");
    }
}
