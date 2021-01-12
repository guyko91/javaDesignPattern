package strategyPattern.tobe.strategies;

import strategyPattern.tobe.interfaces.AttackStrategy;

public class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have strong punch.");
    }
}
