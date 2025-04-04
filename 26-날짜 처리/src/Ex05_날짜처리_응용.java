import java.util.Calendar;

public class Ex05_날짜처리_응용 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        // 이번 달은 몇 주로 되어 있는가?
        int weekCount = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

        // 이번 달은 몇일까지 있는가?
        int dayCount = cal.getActualMaximum((Calendar.DAY_OF_MONTH));

        // 이번 달의 1일은 무슨 요일인가?
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int firstDay = cal.get(Calendar.DAY_OF_WEEK);

        // weekCount --> 몇 주인가> --> 행
        // 일~토 --> 7일 --> 열
        int[][] data = new int[weekCount][7];

        // 배열의 원소로 설정할 숫자 --> 날짜값 --> 1씩 증가하면서 배열에 할당
        int count = 1;

        /** 행의 수 만큼 반복 --> "주"수만큼 반복 */
        for(int i = 0; i < data.length; i++) {
            /** 각 행마다 열의 수만큼 반복 --> "요일"만큼 반복 */
            for(int j = 0; j < data[i].length; j++) {
                // i == 0 : 1주차, j가 firstDay보다 작음 : 1주차의 시작요일보다 작음
                // 현재 배ㅕㅇㄹ에 할당할 날짜값이 이번달의 마지막 날짜보다 작은 경우만
                if(!(i == 0 && j+1 < firstDay) && count <= dayCount) {
                    data[i][j] = count;
                    count++;
                }
            }
        }

        /** 배열 출력을 위한 반복문 */
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                if(data[i][j] == 0) {
                    System.out.print("-\t");
                } else {
                    System.out.printf("%d\t", data[i][j]);
                }
            }
            System.out.println();
        }
    }
}
