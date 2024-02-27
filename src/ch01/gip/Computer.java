package ch01.gip;

import ch01.asso2.Main;

public class Computer {
    
    // 합성관계
    private MainBoard mb;
    private CPU c;
    private Memory m;
    private PowerSupply ps;

    public Computer() {
        this.mb = new MainBoard();
        this.c = new CPU();
        this.m = new Memory();
        this.ps = new PowerSupply();
    }
}
