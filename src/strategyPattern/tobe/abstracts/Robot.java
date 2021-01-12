package strategyPattern.tobe.abstracts;

import strategyPattern.tobe.interfaces.AttackStrategy;
import strategyPattern.tobe.interfaces.MoveStrategy;

public abstract class Robot {
    private String name;
    private AttackStrategy attackStrategy;
    private MoveStrategy moveStrategy;
    public void move() {moveStrategy.move();};
    public void attack() {attackStrategy.attack();};

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
}
