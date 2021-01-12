package strategyPattern.asis.robots;

import strategyPattern.asis.abstracts.Robot;

public class TaekwonV extends Robot {

    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have Missle.");
    }

    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}
