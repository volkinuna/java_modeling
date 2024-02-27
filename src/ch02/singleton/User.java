package ch02.singleton;

public class User {

    // 필드
    private String name; // 사용자 이름

    // 생성자
    public User(String name) {
        this.name = name;
    }

    // 사용자가 프린트를 사용해서 프린트 결과를 출력하는 메소드
    public void print() {
        Printer printer = Printer.getPrinter();

        printer.print(this.name + "이(가) 프린트 사용중 : " + printer.toString()); // toString() <- 객체를 문자 타입으로 출력해주는..
    }
}
