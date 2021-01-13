package singletonPattern.tobe;

import singletonPattern.tobe.solutions.Printer3;

public class UserThread extends Thread {
    public UserThread(String name) {super(name);};
    public void run() {
        Printer3.print(Thread.currentThread().getName());
    }
}
