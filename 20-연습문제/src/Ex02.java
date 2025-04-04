abstract class Course {
    private String courseName;
    private String teacherName;

    public Course(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return this.courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return this.teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void showInfo() {
        System.out.printf("● 수업명: %s / 교사: %s\n", this.courseName, this.teacherName);
    }

    public abstract void startClass();
}

class OnlineCourse extends Course {
    public OnlineCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }

    @Override
    public void startClass() {
        System.out.println("  Zoom 링크를 통해 온라인 수업을 시작합니다.");
    }
}

class OfflineCourse extends Course {
    public OfflineCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }

    @Override
    public void startClass() {
        System.out.println("  지정된 강의실에서 대면면 수업을 시작합니다.");
    }
}

class HybridCourse extends Course {
    public HybridCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }

    @Override
    public void startClass() {
        System.out.println("  온라인과 오프라인 수업을 병행합니다.");
    }

    public void switchMode(String mode) {
        System.out.printf("● 현재 수업 모드를 [%s]로 변경합니다.\n", mode);
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Course[] course = new Course[3];
        course[0] = new OnlineCourse("자바 프로그래밍", "김교수");
        course[1] = new OfflineCourse("자료구조", "이교수");
        course[2] = new HybridCourse("AI 프로젝트", "박교수");

        for(int i = 0; i < course.length; i++) {
            course[i].showInfo();
            course[i].startClass();
            System.out.println();
        }

        HybridCourse h = (HybridCourse) course[2];
        h.switchMode("실시간 화상");
    }
}