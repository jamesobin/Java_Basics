public class Ex05_스코프1 {
    public static void main(String[] args) {
        if(true) {
            int num = 100;

            for(int i = 0; i < 5; i++) {
                num++;
            }
        }

        System.out.println(num);
    }
}
