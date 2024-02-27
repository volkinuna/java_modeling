package ch01.asso2;

import java.util.ArrayList;

public class Student {

    // 필드
    private String name; // 학생 이름

    // Student는 Course를 알고 있다.(의존하고 있다.)
    // 학생은 여러개의 과목을 수강한다.
    private ArrayList<Course> courses; // ArrayList<> : 여러개의 객체 저장 가능

    // 생성자
    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    // 수강 신청
    public void registerCourse(Course course) {
        courses.add(course);
    }

    // 수강 취소
    public void dropCourse(Course course) {
        courses.remove(course);
    }
}

