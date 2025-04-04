public class Ex04_IF문_논리값_조건 {
    public static void main(String[] args) {
        // boolean isKorean = true;
        boolean isKorean = false;

        if(isKorean == true) {
            System.out.println("한국사람입니다.");
        }

        if(isKorean == false) {
            System.out.println("한국사람이 아닙니다.");
        }

        if(isKorean != true) {
            System.out.println("한국사람이 아닙니다.");
        }

        if(isKorean != false) {
            System.out.println("한국사람입니다.");
        }

        if(isKorean) {
            System.out.println("한국사람입니다.");
        }

        if(!isKorean) {
            System.out.println("한국사람이 아닙니다.");
        }
    }
}