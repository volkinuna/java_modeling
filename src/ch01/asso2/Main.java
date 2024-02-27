package ch01.asso2;

public class Main {
    public static void main(String[] args) {

        // 과목
        Course java = new Course("java");
        Course python = new Course("python");

        // 학생
        Student eun = new Student("최은석");
        Student vol = new Student("최볼키");

        // 수강 신청
        eun.registerCourse(java);
        eun.registerCourse(python);

        // 수강 취소
        eun.dropCourse(python);
        
        // 과목에 학생 추가
        java.addStudent(eun);
        java.addStudent(vol);
        
        // 과목에 학생 제거
        java.removeStudent(vol);
    }
}
