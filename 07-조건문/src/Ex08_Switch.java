public class Ex08_Switch {
    public static void main(String[] args) {
        String grade = "B";

        switch(grade) {
            case "A":
                System.out.println("91~100점 사이입니다.");
                break;
            case "B":
                System.out.println("81~90점 사이입니다.");
                break;
            case "C":
                System.out.println("71~80점 사이입니다.");
                break;
            default:
                System.out.println("70점 이하입니다.");
                break;
        }

        if(grade == "A") {
            System.out.println("91~100점 사이입니다.");
        } else if(grade == "B") {
            System.out.println("81~90점 사이입니다.");
        } else if(grade == "C") {
            System.out.println("71~80점 사이입니다.");
        } else {
            System.out.println("70점 이하입니다.");
        }
    }
}
