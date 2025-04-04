public class Ex02 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 2, 5};
        int[] copy = new int[arr.length];

        for(int i = 0; i < copy.length; i++) {
            copy[i] = arr[i];

            System.out.printf("copy[%d]=%d\n", i, copy[i]);
        }
    }
}
