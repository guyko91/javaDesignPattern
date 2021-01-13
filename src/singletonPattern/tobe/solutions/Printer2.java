package singletonPattern.tobe.solutions;

public class Printer2 {
    // 외부에 제공할 자기 자신의 인스턴스
    private static Printer2 printer = null;
    private int counter = 0;
    private Printer2() {};

    // 인스턴스를 만드는 메서드 동기화 (임계 구역)
    public synchronized static Printer2 getPrinter() {
        if(printer == null) {
            printer = new Printer2();
        }
        return printer;
    }

    public void print(String str) {
        synchronized (this) {
            counter++;
            System.out.println(str + counter);
        }
    }
}
