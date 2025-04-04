import java.util.Scanner;

public class Ex03_IF문_논리식_조건 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int point = reader.nextInt();
        reader.close();

        if(point > 70 && point <= 80) {
            System.out.println("C학점 입니다.");
        }

        if(point <= 70 || point > 80) {
            System.out.println("C학점이 아닙니다.");
        }
    }
}