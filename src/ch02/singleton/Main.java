package ch02.singleton;

public class Main {

    private static final int USER_NUM = 10; // 직원수

    public static void main(String[] args) {

        // User 객체를 저장할 수 있는 배열
        User[] user = new User[USER_NUM];

        for (int i = 0; i < USER_NUM; i++) {
            user[i] = new User(i + "번 직원");
            user[i].print();
        }
    }
}
