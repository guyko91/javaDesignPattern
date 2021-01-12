package strategyPattern.tobe.strategies;

import strategyPattern.tobe.interfaces.MoveStrategy;

public class FlyingStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("I can Fly.");
    }
}
