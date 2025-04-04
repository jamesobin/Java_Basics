import java.util.Scanner;

import com.jamesobin.helpers.FileHelper;

public class Helper_연습문제 {
    public static void main(String[] args) {
        String filePath = "./helper연습문제.txt";


        Scanner scan = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = scan.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String phoneNumber = scan.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();
        System.out.print("키를 입력하세요 : ");
        double height = scan.nextDouble();
        System.out.println();

        scan.close();
        
        String content = "이름 : " + name + "\n연락처 : " + phoneNumber + "\n나이 : " + age + "세\n키 : " + height + "cm";

        /** 저장 테스트 */ 
        try {
            FileHelper.getInstance().writeString(filePath, content);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /** 읽기 테스트 */
        try {
            String read = FileHelper.getInstance().readString(filePath);
            System.out.println(read);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
