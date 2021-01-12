package tobe.strategies;

import tobe.interfaces.MoveStrategy;

public class FlyingStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("I can Fly.");
    }
}
