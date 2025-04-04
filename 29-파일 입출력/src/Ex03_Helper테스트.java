import java.io.UnsupportedEncodingException;

import com.jamesobin.helpers.FileHelper;

public class Ex03_Helper테스트 {
    public static void main(String[] args) {
        String filePath = "./helper테스트.txt";
        String content = "이것은 테스트 입니다.";

        byte[] data = null;
        try {
            data = content.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        }

        /** 저장 테스트 */
        try {
            FileHelper.getInstance().write(filePath, data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /** 읽기 테스트 */
        try {
            byte[] read = FileHelper.getInstance().read(filePath);
            System.out.println(new String(read, "utf-8"));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
