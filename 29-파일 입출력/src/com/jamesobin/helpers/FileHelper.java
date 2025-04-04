package com.jamesobin.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
    private static FileHelper current = null;

    public static FileHelper getInstance() {
        if(current == null) {
            current = new FileHelper();
        }

        return current;
    }

    public static void freeInstance() {
        current = null;
    }

    private FileHelper() {
        super();
    }

    /**
     * 파일에 데이터를 쓰는 메서드
     * @param filePath - 파일 경로
     * @param data - 저장할 데이터
     * @throws Exception - 파일 입출력 예외
     */
    public void write(String filePath, byte[] data) throws Exception {
        OutputStream os = null;
        try {
            // 저장할 파일 스트림 생성성
            os = new FileOutputStream(filePath);
            // 파일 쓰기기
            os.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            // 사용한 스트림은 에러 발생여부에 상관 없이 반드시 닫아야 한다.
            if(os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } // end if
        } // try ~ catch ~ finally
    }

    /**
     * 파일에서 데이터를 읽는 메서드
     * @param filePath - 파일 경로
     * @return 파일에 저장된 데이터
     * @throws Exception - 파일 입출력 예외
     */
    public byte[] read(String filePath) throws Exception {
        byte[] data = null;

        // 파일 읽기
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            data = new byte[is.available()];
            is.read(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return data;
    }

    /**
     * 파일에 문자열을 쓰는 메서드
     * @param filePath - 파일 경로
     * @param content - 저장할 문자열
     * @throws Exception - 파일 입출력 예외
     */
    public void writeString(String filePath, String content) throws Exception {
        try {
            this.write(filePath, content.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 파일에 문자열을 쓰는 메서드
     * @param filePath - 파일 경로
     * @return 파일에 저장된 문자열열
     * @throws Exception - 파일 입출력 예외
     */
    public String readString(String filePath) throws Exception {
        String content = null;

        try {
            byte[] data = read(filePath);
            content = new String(data, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return content;
    }
}
