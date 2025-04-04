public class Ex06_IfElse {
    public static void main(String[] args) {
        boolean isKorean = true;
        // boolean isKorean = false;

        if(isKorean) {
            System.out.println("한국사람입니다.");
        } else {
            System.out.println("한국사람이 아닙니다.");
        }

        if(!isKorean) {
            System.out.println("한국사람이 아닙니다.");
        } else {
            System.out.println("한국사람입니다.");
        }
        
    }
}