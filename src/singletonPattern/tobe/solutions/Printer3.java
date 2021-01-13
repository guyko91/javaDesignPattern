package singletonPattern.tobe.solutions;

public class Printer3 {
    private static int counter = 0;
    public synchronized static void print(String str) {
        counter++;
        System.out.println(str + counter);
    }
}
