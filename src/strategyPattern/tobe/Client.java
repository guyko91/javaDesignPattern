package strategyPattern.tobe;

import strategyPattern.tobe.abstracts.Robot;
import strategyPattern.tobe.robots.Atom;
import strategyPattern.tobe.robots.TaekwonV;
import strategyPattern.tobe.strategies.FlyingStrategy;
import strategyPattern.tobe.strategies.MissleStrategy;
import strategyPattern.tobe.strategies.PunchStrategy;
import strategyPattern.tobe.strategies.WalkingStrategy;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("taekwonV");
        Robot atom = new Atom("atom");

        taekwonV.setAttackStrategy(new MissleStrategy());
        taekwonV.setMoveStrategy(new WalkingStrategy());

        atom.setAttackStrategy(new PunchStrategy());
        atom.setMoveStrategy(new FlyingStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
