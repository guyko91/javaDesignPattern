package tobe;

import tobe.abstracts.Robot;
import tobe.robots.Atom;
import tobe.robots.TaekwonV;
import tobe.strategies.FlyingStrategy;
import tobe.strategies.MissleStrategy;
import tobe.strategies.PunchStrategy;
import tobe.strategies.WalkingStrategy;

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
