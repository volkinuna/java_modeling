package ch01.asso;

public class Course {

    // 필드
    private String name; // 과목명

    // 생성자
    public Course(String name) {
        this.name = name;
    }

    // 과목명 리턴 메소드
    public String getName() {
        return name;
    }
}
