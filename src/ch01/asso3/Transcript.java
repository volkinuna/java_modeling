package ch01.asso3;

public class Transcript {

    // 필드
    private Student student; // 성적 하나당 한 명의 학생
    private Course course; // 성적 하나당 과목 하나
    private String date; // 시험 날짜
    private String grade; // 점수
    
    // 생성자
    public Transcript(Student student, Course course) {
        this.student = student;
        this.student.addTranscript(this); // this는 생성한 Transcript 객체를 의미

        this.course = course;
        this.course.addTranscript(this);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
