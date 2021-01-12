package tobe.strategies;

import tobe.interfaces.AttackStrategy;

public class MissleStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have Missile.");
    }
}
