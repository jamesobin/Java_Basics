public class Ex10_Break제어 {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
            case "B":
            case "C":
                System.out.println("Pass");
                break;
            default:
                System.out.println("Not-Pass");
                break;
        }

        if(grade == "A" || grade == "B" || grade == "C") {
            System.out.println("Pass");
        } else {
            System.out.println("Not-Pass");
        }
    }
}
