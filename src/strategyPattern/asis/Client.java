package strategyPattern.asis;

import strategyPattern.asis.robots.Atom;
import strategyPattern.asis.robots.TaekwonV;

public class Client {
    public static void main(String[] args) {

        TaekwonV taekwonV = new TaekwonV("TaekwonV");
        Atom atom = new Atom("Atom");

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
