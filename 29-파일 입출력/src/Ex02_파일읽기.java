import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Ex02_파일읽기 {
    public static void main(String[] args) {
        // 읽어올 파일의 경로
        String filePath = "./test.txt";
        // 읽어온 내용이 저장될 스트림
        byte[] buffer = null;
        // 읽어온 내용이 저장되어 있는 스트림이 변환될 문자열
        String content = null;

        // 파일 읽기
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            buffer = new byte[is.available()];
            is.read(buffer);
        } catch (FileNotFoundException e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("------------------------------");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("------------------------------");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("------------------------------");
            e.printStackTrace();
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(buffer != null) {
                try {
                    content = new String(buffer, "utf-8");
                    System.out.println(content);
                } catch (UnsupportedEncodingException e) {
                    System.out.println("[ERROR] 인코딩 지정 에러");
                    e.printStackTrace();
                }
            }
        }
    }
}
