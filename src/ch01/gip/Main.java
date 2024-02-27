package ch01.gip;

public class Main {
    public static void main(String[] args) {

        // 1. 합성관계
        // 컴퓨터만 생성해도 컴퓨터 부품들이 생성된다.(전체를 만드련 부분까지 생성)
        Computer c = new Computer();
        // 컴퓨터가 사라지면 컴퓨터 부품들도 사라진다.(전체가 사라지면 부분까지 사라짐)
        c = null;

        // 2. 집약관계
        MainBoard mb = new MainBoard();
        CPU cpu = new CPU();
        Memory m = new Memory();
        PowerSupply ps = new PowerSupply();

        // 컴퓨터가 사라져도 부품은 남아있다.(전체가 사라져도 부분은 남아있다.)
        Computer2 c2 = new Computer2(mb, cpu, m, ps);
        c2 = null;
    }
}
