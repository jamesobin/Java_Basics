public class Ex03_예외처리 {
    public static void main(String[] args) {
        int[] k = {10, 20, 30};

        try {
            /** 에러가 발생할 것으로 예상되는 코드를 try 블록으로 감싼다. */
            for(int i = 0; i < 5; i++) {
                System.out.println(k[i]);
            }
        } catch(Exception e) {
            /** try 블록 안에서 에러가 발생한 경우 실행되는 블록 */ 
            // try와 catch는 항상 함계 명시되어야 함
            // try블록을 수행하는 과정에서 에러가 발생하면 프로그램이 다운되지 않고
            // 그 즉시 catch블록으로 제어가 이동된다
            System.out.println("에러가 발생했습니다.");
            System.out.println("에러의 원인: " + e.getMessage());
            // 시스템에 의해 출력되는 에러메시지 전문을 강제로 출력함
            System.out.println("=====================");
            e.printStackTrace();
            System.out.println("=====================");
        } finally {
            /** 에러의 발생 여부에 상관없이 무조건 실행되는 블록 */
            // 필요하지 않다면 생략 가능
            System.out.println("배열 탐색 종료");
        }

        System.out.println("fin :)");
    }
}
