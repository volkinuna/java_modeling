package ch02.singleton;

public class Printer {

    // 필드
    private static Printer printer = null; // 객체를 참조하지 않는 상태(객체 생성이 안된 상태)
    // static 키워드가 붙었으니 하나만 만들어 공유, private가 붙었으니 이 클래스 안에서만 사용

    // 생성자
    private Printer() {}

    // 메소드
    // 사용자가 이용해야 할 프린터 객체를 리턴 -> ★프린터 객체는 하나만 생성해서 공유되어야한다.(싱글톤)
    public static Printer getPrinter() { // getPrinter() 메소드를 여러번 사용해도 같은 new Printer() 객체를 사용하게 한다.
        if (printer == null) {
            // printer가 객체를 참조하지 않는다면 객체를 생성해 참조하도록 한다.
            printer = new Printer(); // new Printer() 객체가 생성되면 static이 붙어있어서 공유해서 사용한다.
        }
        
        // printer가new Printer() 객체를 참조하고 있다면 그냥 리턴을 해준다.
        return printer;
    }

    // 프린트해주는 기능
    public void print(String str) {
        System.out.println(str);
    }
}
