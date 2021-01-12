package tobe.strategies;

import tobe.interfaces.MoveStrategy;

public class WalkingStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}
